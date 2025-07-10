package com.vprioul.cv.core.ui

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import com.vprioul.cv.core.designsystem.theme.DpIcon
import com.vprioul.cv.core.domain.model.ReferenceData
import kotlinx.collections.immutable.ImmutableList

@Composable
fun AppReference(
    references: ImmutableList<ReferenceData>,
    modifier: Modifier = Modifier,
    horizontalPadding: Dp = 0.dp
) {
    val context = LocalContext.current
    LazyRow(
        horizontalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxWidth()
    ) {
        items(references) { reference ->
            val linkUrl = reference.url
            Image(
                modifier = Modifier
                    .padding(horizontal = horizontalPadding)
                    .size(DpIcon)
                    .clickable {
                        val intent = Intent(Intent.ACTION_VIEW, linkUrl.toUri())
                        context.startActivity(intent)
                    },
                painter = painterResource(
                    ResourcesHelper.getDrawableAppIdByName(reference.appLogo)
                ),
                contentDescription = reference.contentDescription
            )
        }
    }
}
