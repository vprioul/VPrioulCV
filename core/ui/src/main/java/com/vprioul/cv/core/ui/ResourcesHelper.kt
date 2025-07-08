package com.vprioul.cv.core.ui

import android.content.Context
import com.vprioul.cv.core.resources.R

object ResourcesHelper {
    fun Context.getDrawableIdByName(name: String): Int {
        return resources.getIdentifier(name, "drawable", packageName)
    }

    /*fun getDrawableIdByName(name: String): Int {
        return when (name) {
            "ic_git" -> R.drawable.ic_git
            "ic_git_hub" -> R.drawable.ic_git_hub
            "ic_jenkins" -> R.drawable.ic_jenkins
            "ic_sublime_text" -> R.drawable.ic_sublime_text
            "ic_cursor" -> R.drawable.ic_cursor
            "ic_chatgpt" -> R.drawable.ic_chatgpt
            "ic_gemini" -> R.drawable.ic_gemini
            "ic_claude_ai" -> R.drawable.ic_claude_ai
            "ic_mistral" -> R.drawable.ic_mistral
            "ic_deepseek" -> R.drawable.ic_deepseek
            "ic_docker" -> R.drawable.ic_docker
            "ic_google_chrome" -> R.drawable.ic_google_chrome
            "ic_google_play" -> R.drawable.ic_google_play
            "ic_jira" -> R.drawable.ic_jira
            "ic_slack" -> R.drawable.ic_slack
            "ic_teams" -> R.drawable.ic_teams
            "ic_redmine" -> R.drawable.ic_redmine
            "ic_sonar" -> R.drawable.ic_sonar
            "ic_vm_ware" -> R.drawable.ic_vm_ware
            "ic_azure_devops" -> R.drawable.ic_azure_devops
            "ic_android" -> R.drawable.ic_android
            "ic_android_auto" -> R.drawable.ic_android_auto
            "ic_android_tv" -> R.drawable.ic_android_tv
            "ic_ios" -> R.drawable.ic_ios
            "ic_mac" -> R.drawable.ic_mac
            "ic_linux" -> R.drawable.ic_linux
            "ic_debian" -> R.drawable.ic_debian
            "ic_windows" -> R.drawable.ic_windows
            "ic_visual_studio" -> R.drawable.ic_visual_studio
            "ic_python" -> R.drawable.ic_python
            "ic_bash" -> R.drawable.ic_bash
            "ic_c" -> R.drawable.ic_c
            "ic_cmake" -> R.drawable.ic_cmake
            "ic_drupal" -> R.drawable.ic_drupal
            "ic_firefox" -> R.drawable.ic_firefox
            "ic_safari" -> R.drawable.ic_safari
            "ic_gherkin" -> R.drawable.ic_gherkin
            "ic_robot_framework" -> R.drawable.ic_robot_framework
            "ic_html" -> R.drawable.ic_html
            "ic_php" -> R.drawable.ic_php
            "ic_js" -> R.drawable.ic_js
            "ic_symfony" -> R.drawable.ic_symfony
            "ic_node" -> R.drawable.ic_node
            "ic_qt" -> R.drawable.ic_qt
            "ic_titanium_appcelerator" -> R.drawable.ic_titanium_appcelerator
            "ic_tizen" -> R.drawable.ic_tizen
            "ic_windows_phone" -> R.drawable.ic_windows_phone
            "ic_wordpress" -> R.drawable.ic_wordpress
            "ic_mattermost" -> R.drawable.ic_mattermost
            "ic_french" -> R.drawable.ic_french
            "ic_england" -> R.drawable.ic_england
            "ic_spain" -> R.drawable.ic_spain
            "ic_cambodia" -> R.drawable.ic_cambodia
            else -> R.drawable.ic_default_image
        }
    }*/
    private val skillIconMap = mapOf(
        "ic_git" to R.drawable.ic_git,
        "ic_git_hub" to R.drawable.ic_git_hub,
        "ic_jenkins" to R.drawable.ic_jenkins,
        "ic_sublime_text" to R.drawable.ic_sublime_text,
        "ic_cursor" to R.drawable.ic_cursor,
        "ic_chatgpt" to R.drawable.ic_chatgpt,
        "ic_gemini" to R.drawable.ic_gemini,
        "ic_claude_ai" to R.drawable.ic_claude_ai,
        "ic_mistral" to R.drawable.ic_mistral,
        "ic_deepseek" to R.drawable.ic_deepseek,
        "ic_docker" to R.drawable.ic_docker,
        "ic_google_chrome" to R.drawable.ic_google_chrome,
        "ic_google_play" to R.drawable.ic_google_play,
        "ic_jira" to R.drawable.ic_jira,
        "ic_slack" to R.drawable.ic_slack,
        "ic_teams" to R.drawable.ic_teams,
        "ic_redmine" to R.drawable.ic_redmine,
        "ic_sonar" to R.drawable.ic_sonar,
        "ic_vm_ware" to R.drawable.ic_vm_ware,
        "ic_azure_devops" to R.drawable.ic_azure_devops,
        "ic_android" to R.drawable.ic_android,
        "ic_android_auto" to R.drawable.ic_android_auto,
        "ic_android_tv" to R.drawable.ic_android_tv,
        "ic_ios" to R.drawable.ic_ios,
        "ic_mac" to R.drawable.ic_mac,
        "ic_linux" to R.drawable.ic_linux,
        "ic_debian" to R.drawable.ic_debian,
        "ic_windows" to R.drawable.ic_windows,
        "ic_visual_studio" to R.drawable.ic_visual_studio,
        "ic_python" to R.drawable.ic_python,
        "ic_bash" to R.drawable.ic_bash,
        "ic_c" to R.drawable.ic_c,
        "ic_cmake" to R.drawable.ic_cmake,
        "ic_drupal" to R.drawable.ic_drupal,
        "ic_firefox" to R.drawable.ic_firefox,
        "ic_safari" to R.drawable.ic_safari,
        "ic_gherkin" to R.drawable.ic_gherkin,
        "ic_robot_framework" to R.drawable.ic_robot_framework,
        "ic_html" to R.drawable.ic_html,
        "ic_php" to R.drawable.ic_php,
        "ic_js" to R.drawable.ic_js,
        "ic_symfony" to R.drawable.ic_symfony,
        "ic_node" to R.drawable.ic_node,
        "ic_qt" to R.drawable.ic_qt,
        "ic_titanium_appcelerator" to R.drawable.ic_titanium_appcelerator,
        "ic_tizen" to R.drawable.ic_tizen,
        "ic_windows_phone" to R.drawable.ic_windows_phone,
        "ic_wordpress" to R.drawable.ic_wordpress,
        "ic_mattermost" to R.drawable.ic_mattermost,
        "ic_french" to R.drawable.ic_french,
        "ic_england" to R.drawable.ic_england,
        "ic_spain" to R.drawable.ic_spain,
        "ic_cambodia" to R.drawable.ic_cambodia
    )

    fun getDrawableIdByName(name: String): Int {
        return skillIconMap[name] ?: R.drawable.ic_default_image
    }

    fun Context.getStringIdByName(name: String): Int {
        return resources.getIdentifier(name, "drawable", packageName)
    }
}
