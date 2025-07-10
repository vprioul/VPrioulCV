package com.vprioul.cv.core.ui

import android.content.Context
import com.vprioul.cv.core.resources.R

object ResourcesHelper {
    fun Context.getDrawableIdByName(name: String): Int {
        return resources.getIdentifier(name, "drawable", packageName)
    }

    private val skillIconMap = mapOf(
        "ic_kotlin" to R.drawable.ic_kotlin,
        "ic_java" to R.drawable.ic_java,
        "ic_jni" to R.drawable.ic_jni,
        "ic_adb" to R.drawable.ic_adb,
        "ic_ndk" to R.drawable.ic_ndk,
        "ic_appium" to R.drawable.ic_appium,
        "ic_swift" to R.drawable.ic_swift,
        "ic_obj_c" to R.drawable.ic_obj_c,
        "ic_compose" to R.drawable.ic_compose,
        "ic_room" to R.drawable.ic_room,
        "ic_hilt" to R.drawable.ic_hilt,
        "ic_koin" to R.drawable.ic_koin,
        "ic_coil" to R.drawable.ic_coil,
        "ic_glide" to R.drawable.ic_glide,
        "ic_google_map" to R.drawable.ic_google_map,
        "ic_google_drive" to R.drawable.ic_google_drive,
        "ic_mailjet" to R.drawable.ic_mailjet,
        "ic_sqlite" to R.drawable.ic_sqlite,
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

    fun getDrawableSkillIdByName(name: String?): Int {
        return skillIconMap[name] ?: R.drawable.ic_default_image
    }

    private val appIconMap = mapOf(
        "ic_git_hub" to R.drawable.ic_git_hub,
        "ic_linkedin" to R.drawable.ic_linkedin,
        "ic_instagram" to R.drawable.ic_instagram,
        "ic_exomind" to R.drawable.ic_exomind,
        "ic_tdf" to R.drawable.ic_tdf,
        "ic_dakar" to R.drawable.ic_dakar,
        "ic_vuelta" to R.drawable.ic_vuelta,
        "ic_aviwest" to R.drawable.ic_aviwest,
        "ic_mojopro" to R.drawable.ic_mojopro,
        "ic_kantar" to R.drawable.ic_kantar,
        "ic_detectnow" to R.drawable.ic_detectnow,
        "ic_ovianet" to R.drawable.ic_ovianet,
        "ic_generation" to R.drawable.ic_generation,
        "ic_ithylo" to R.drawable.ic_ithylo,
    )

    fun getDrawableAppIdByName(name: String?): Int {
        return appIconMap[name] ?: R.drawable.ic_default_image
    }

    private val sportIconMap = mapOf(
        "ic_football" to R.drawable.ic_football,
        "ic_running" to R.drawable.ic_running,
        "ic_diving" to R.drawable.ic_diving,
        "ic_padel" to R.drawable.ic_padel,
        "ic_surf" to R.drawable.ic_surf,
        "ic_bike" to R.drawable.ic_bike,
        "ic_swimming" to R.drawable.ic_swimming,
        "ic_ski" to R.drawable.ic_ski,
        "ic_wakeboard" to R.drawable.ic_wakeboard,
        "ic_squash" to R.drawable.ic_squash,
    )

    fun getDrawableSportIdByName(name: String?): Int {
        return sportIconMap[name] ?: R.drawable.ic_default_image
    }

    fun Context.getStringIdByName(name: String): Int {
        return resources.getIdentifier(name, "drawable", packageName)
    }

    private val experienceStringMap = mapOf(
        "experience_exomind_duration" to R.string.experience_exomind_duration,
        "experience_exomind_title" to R.string.experience_exomind_title,
        "experience_exomind_short_description" to R.string.experience_exomind_short_description,
        "experience_exomind_description" to R.string.experience_exomind_description,

        "experience_aviwest_duration" to R.string.experience_aviwest_duration,
        "experience_aviwest_title" to R.string.experience_aviwest_title,
        "experience_aviwest_short_description" to R.string.experience_aviwest_short_description,
        "experience_aviwest_description" to R.string.experience_aviwest_description,

        "experience_kantar_duration" to R.string.experience_kantar_duration,
        "experience_kantar_title" to R.string.experience_kantar_title,
        "experience_kantar_short_description" to R.string.experience_kantar_short_description,
        "experience_kantar_description" to R.string.experience_kantar_description,

        "experience_ovianet_duration" to R.string.experience_ovianet_duration,
        "experience_ovianet_title" to R.string.experience_ovianet_title,
        "experience_ovianet_short_description" to R.string.experience_ovianet_short_description,
        "experience_ovianet_description" to R.string.experience_ovianet_description,
    )
    fun getStringExpIdByName(name: String?): Int {
        return experienceStringMap[name] ?: R.string.error
    }

    private val sportStringMap = mapOf(
        "hobbies_sports_foot" to R.string.hobbies_sports_foot,
        "hobbies_sports_foot_bio" to R.string.hobbies_sports_foot_bio,

        "hobbies_sports_run" to R.string.hobbies_sports_run,
        "hobbies_sports_run_bio" to R.string.hobbies_sports_run_bio,

        "hobbies_sports_dive" to R.string.hobbies_sports_dive,
        "hobbies_sports_dive_bio" to R.string.hobbies_sports_dive_bio,

        "hobbies_sports_padel" to R.string.hobbies_sports_padel,
        "hobbies_sports_padel_bio" to R.string.hobbies_sports_padel_bio,

        "hobbies_sports_surf" to R.string.hobbies_sports_surf,
        "hobbies_sports_surf_bio" to R.string.hobbies_sports_surf_bio,

        "hobbies_sports_bike" to R.string.hobbies_sports_bike,
        "hobbies_sports_bike_bio" to R.string.hobbies_sports_bike_bio,

        "hobbies_sports_swim" to R.string.hobbies_sports_swim,
        "hobbies_sports_swim_bio" to R.string.hobbies_sports_swim_bio,

        "hobbies_sports_ski" to R.string.hobbies_sports_ski,
        "hobbies_sports_ski_bio" to R.string.hobbies_sports_ski_bio,

        "hobbies_sports_wake" to R.string.hobbies_sports_wake,
        "hobbies_sports_wake_bio" to R.string.hobbies_sports_wake_bio,

        "hobbies_sports_squash" to R.string.hobbies_sports_squash,
        "hobbies_sports_squash_bio" to R.string.hobbies_sports_squash_bio,
    )
    fun getStringSportIdByName(name: String?): Int {
        return sportStringMap[name] ?: R.string.error
    }

    private val travelsStringMap = mapOf(
        "hobbies_travel_iceland" to R.string.hobbies_travel_iceland,
        "hobbies_travel_seychelles" to R.string.hobbies_travel_seychelles,
        "hobbies_travel_thailand" to R.string.hobbies_travel_thailand,
        "hobbies_travel_malaisian" to R.string.hobbies_travel_malaisian,
        "hobbies_travel_reunion" to R.string.hobbies_travel_reunion,
        "hobbies_travel_guadeloupe" to R.string.hobbies_travel_guadeloupe,
        "hobbies_travel_martinique" to R.string.hobbies_travel_martinique,
        "hobbies_travel_sweden" to R.string.hobbies_travel_sweden,
        "hobbies_travel_croatia" to R.string.hobbies_travel_croatia,
        "hobbies_travel_spain_portugal" to R.string.hobbies_travel_spain_portugal,
        "hobbies_travel_spain" to R.string.hobbies_travel_spain,
        "hobbies_travel_portugal" to R.string.hobbies_travel_portugal,
        "hobbies_travel_sicile" to R.string.hobbies_travel_sicile,
        "hobbies_travel_italia" to R.string.hobbies_travel_italia,
        "hobbies_travel_belgium" to R.string.hobbies_travel_belgium,
        "hobbies_travel_malta" to R.string.hobbies_travel_malta,
        "hobbies_travel_hungary" to R.string.hobbies_travel_hungary,
        "hobbies_travel_nederland" to R.string.hobbies_travel_nederland,
        "hobbies_travel_england" to R.string.hobbies_travel_england,
        "hobbies_travel_usa" to R.string.hobbies_travel_usa,
        "hobbies_travel_marocco" to R.string.hobbies_travel_marocco,
        "hobbies_travel_switzerland" to R.string.hobbies_travel_switzerland,
        "hobbies_travel_lille" to R.string.hobbies_travel_lille,
        "hobbies_travel_corse" to R.string.hobbies_travel_corse,
        "hobbies_travel_strabourg" to R.string.hobbies_travel_strabourg,
        "hobbies_travel_lyon" to R.string.hobbies_travel_lyon,
        "hobbies_travel_surf" to R.string.hobbies_travel_surf,
        "hobbies_travel_ski" to R.string.hobbies_travel_ski,
        "hobbies_travel_autria" to R.string.hobbies_travel_autria,
    )

    fun getStringTravelIdByName(name: String?): Int {
        return travelsStringMap[name] ?: R.string.error
    }
}
