package com.vprioul.cv.feature.skills.data.repository

import com.vprioul.cv.core.resources.R
import com.vprioul.cv.feature.skills.data.model.Skill
import com.vprioul.cv.feature.skills.data.model.SkillCategory
import com.vprioul.cv.feature.skills.data.model.SkillType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class SkillsRepositoryImpl : SkillsRepository {
    @Suppress("LongMethod")
    override fun getSkills(): Flow<List<Skill>> {
        return flowOf(
            listOf(
                Skill(
                    name = "Kotlin",
                    masteryLevel = 100,
                    icon = R.drawable.ic_kotlin,
                    category = SkillCategory.MOBILE,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Java",
                    masteryLevel = 100,
                    icon = R.drawable.ic_java,
                    category = SkillCategory.MOBILE,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "JNI",
                    masteryLevel = 100,
                    icon = R.drawable.ic_jni,
                    category = SkillCategory.MOBILE,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "ADB Android Debug Bridge",
                    masteryLevel = 75,
                    icon = R.drawable.ic_adb,
                    category = SkillCategory.MOBILE,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Android NDK",
                    masteryLevel = 75,
                    icon = R.drawable.ic_ndk,
                    category = SkillCategory.MOBILE,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Appium",
                    masteryLevel = 75,
                    icon = R.drawable.ic_appium,
                    category = SkillCategory.MOBILE,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Swift",
                    masteryLevel = 60,
                    icon = R.drawable.ic_swift,
                    category = SkillCategory.MOBILE,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Objective-C",
                    masteryLevel = 75,
                    icon = R.drawable.ic_obj_c,
                    category = SkillCategory.MOBILE,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Jetpack compose",
                    masteryLevel = 75,
                    icon = R.drawable.ic_compose,
                    category = SkillCategory.LIBRARIES,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Room",
                    icon = R.drawable.ic_room,
                    category = SkillCategory.LIBRARIES,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Hilt",
                    icon = R.drawable.ic_hilt,
                    category = SkillCategory.LIBRARIES,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Koin",
                    icon = R.drawable.ic_koin,
                    category = SkillCategory.LIBRARIES,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Coil",
                    icon = R.drawable.ic_coil,
                    category = SkillCategory.LIBRARIES,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Glide",
                    icon = R.drawable.ic_glide,
                    category = SkillCategory.LIBRARIES,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Google Map",
                    icon = R.drawable.ic_google_map,
                    category = SkillCategory.LIBRARIES,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Google Drive",
                    icon = R.drawable.ic_google_drive,
                    category = SkillCategory.LIBRARIES,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Mailjet",
                    icon = R.drawable.ic_mailjet,
                    category = SkillCategory.LIBRARIES,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "SQLite",
                    icon = R.drawable.ic_sqlite,
                    category = SkillCategory.LIBRARIES,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Git",
                    icon = R.drawable.ic_git,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Git Hub",
                    icon = R.drawable.ic_git_hub,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Jenkins",
                    masteryLevel = 75,
                    icon = R.drawable.ic_jenkins,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Sublime Text",
                    masteryLevel = 75,
                    icon = R.drawable.ic_sublime_text,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Cursor",
                    masteryLevel = 75,
                    icon = R.drawable.ic_cursor,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Chat GPT",
                    masteryLevel = 75,
                    icon = R.drawable.ic_chatgpt,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Gemini",
                    masteryLevel = 75,
                    icon = R.drawable.ic_gemini,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Claude AI",
                    masteryLevel = 75,
                    icon = R.drawable.ic_claude_ai,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Mistral AI",
                    masteryLevel = 75,
                    icon = R.drawable.ic_mistral,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Deepseek",
                    masteryLevel = 75,
                    icon = R.drawable.ic_deepseek,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Docker",
                    masteryLevel = 75,
                    icon = R.drawable.ic_docker,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Google Chrome",
                    masteryLevel = 75,
                    icon = R.drawable.ic_google_chrome,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Google Play",
                    masteryLevel = 75,
                    icon = R.drawable.ic_google_play,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Jira",
                    masteryLevel = 75,
                    icon = R.drawable.ic_jira,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Slack",
                    masteryLevel = 75,
                    icon = R.drawable.ic_slack,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Teams",
                    masteryLevel = 75,
                    icon = R.drawable.ic_teams,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Redmine",
                    masteryLevel = 75,
                    icon = R.drawable.ic_redmine,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Sonar",
                    masteryLevel = 75,
                    icon = R.drawable.ic_sonar,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "VMWare",
                    masteryLevel = 75,
                    icon = R.drawable.ic_vm_ware,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Azure Devops",
                    masteryLevel = 75,
                    icon = R.drawable.ic_azure_devops,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Android Development",
                    masteryLevel = 100,
                    icon = R.drawable.ic_android,
                    category = SkillCategory.PLATFORM,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Android Auto",
                    masteryLevel = 100,
                    icon = R.drawable.ic_android_auto,
                    category = SkillCategory.PLATFORM,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Android TV",
                    masteryLevel = 100,
                    icon = R.drawable.ic_android_tv,
                    category = SkillCategory.PLATFORM,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "iOS development",
                    masteryLevel = 50,
                    icon = R.drawable.ic_ios,
                    category = SkillCategory.PLATFORM,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "MacOS",
                    masteryLevel = 100,
                    icon = R.drawable.ic_mac,
                    category = SkillCategory.PLATFORM,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Linux",
                    masteryLevel = 100,
                    icon = R.drawable.ic_linux,
                    category = SkillCategory.PLATFORM,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Linux Debian",
                    masteryLevel = 100,
                    icon = R.drawable.ic_debian,
                    category = SkillCategory.PLATFORM,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Windows",
                    masteryLevel = 100,
                    icon = R.drawable.ic_windows,
                    category = SkillCategory.PLATFORM,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Visual Studio Code",
                    masteryLevel = 75,
                    icon = R.drawable.ic_visual_studio,
                    category = SkillCategory.TOOLS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Python",
                    icon = R.drawable.ic_python,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Bash",
                    icon = R.drawable.ic_bash,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "C/C++",
                    icon = R.drawable.ic_c,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "CMake",
                    icon = R.drawable.ic_cmake,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Drupal",
                    icon = R.drawable.ic_drupal,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Firefox",
                    icon = R.drawable.ic_firefox,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Safari",
                    icon = R.drawable.ic_safari,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Gherkin",
                    icon = R.drawable.ic_gherkin,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Robot Framework",
                    icon = R.drawable.ic_robot_framework,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "HTML",
                    icon = R.drawable.ic_html,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "PHP",
                    icon = R.drawable.ic_php,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Javascript",
                    icon = R.drawable.ic_js,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Symfony2",
                    icon = R.drawable.ic_symfony,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "node",
                    icon = R.drawable.ic_node,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "QT",
                    icon = R.drawable.ic_qt,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Appcelerator Titanium",
                    icon = R.drawable.ic_titanium_appcelerator,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Tizen",
                    icon = R.drawable.ic_tizen,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Windows Phone",
                    icon = R.drawable.ic_windows_phone,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "WordPress",
                    icon = R.drawable.ic_wordpress,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Mattermost",
                    icon = R.drawable.ic_mattermost,
                    category = SkillCategory.OTHERS,
                    type = SkillType.TECHNICAL
                ),
                Skill(
                    name = "Français",
                    masteryLevel = 100,
                    icon = R.drawable.ic_french,
                    category = SkillCategory.SOFT_SKILL,
                    type = SkillType.SOFT
                ),
                Skill(
                    name = "Anglais",
                    masteryLevel = 50,
                    icon = R.drawable.ic_england,
                    category = SkillCategory.SOFT_SKILL,
                    type = SkillType.SOFT
                ),
                Skill(
                    name = "Espagnol",
                    masteryLevel = 33,
                    icon = R.drawable.ic_spain,
                    category = SkillCategory.SOFT_SKILL,
                    type = SkillType.SOFT
                ),
                Skill(
                    name = "Cambodgien",
                    masteryLevel = 33,
                    icon = R.drawable.ic_cambodia,
                    category = SkillCategory.SOFT_SKILL,
                    type = SkillType.SOFT
                ),
            )
        )
    }
}
