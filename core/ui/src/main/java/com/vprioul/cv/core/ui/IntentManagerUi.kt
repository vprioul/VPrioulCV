package com.vprioul.cv.core.ui

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.core.net.toUri
import com.vprioul.cv.core.domain.model.EmailData
import com.vprioul.cv.core.resources.R

class IntentManagerUi {
    fun shareText(context: Context, messageShare: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, messageShare)
        }
        try {
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.share_with)))
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(context, context.getString(R.string.home_error_share), Toast.LENGTH_SHORT).show()
        }
    }

    fun sendEmail(context: Context, email: EmailData) {
        var intent: Intent? = Intent(Intent.ACTION_SENDTO).apply {
            data = "mailto:${email.to}".toUri()
            putExtra(Intent.EXTRA_SUBJECT, email.subject)
            putExtra(Intent.EXTRA_TEXT, email.body)
        }
        if (intent?.resolveActivity(context.packageManager) == null) {
            intent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email.to))
                putExtra(Intent.EXTRA_SUBJECT, email.subject)
                putExtra(Intent.EXTRA_TEXT, email.body)
            }
            val emailApps = context.packageManager.queryIntentActivities(intent, 0)
            if (emailApps.isNotEmpty()) {
                context.startActivity(
                    Intent.createChooser(intent, context.getString(R.string.send_email_with))
                )
            } else {
                Toast.makeText(context, context.getString(R.string.email_error), Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    fun openUrl(context: Context, url: String) {
        val intent = Intent(Intent.ACTION_VIEW, url.toUri())
        context.startActivity(intent)
    }

    fun makeCall(context: Context, phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = "tel:$phoneNumber".toUri()
        }
        try {
            context.startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(context, context.getString(R.string.phone_error), Toast.LENGTH_SHORT).show()
        }
    }
}
