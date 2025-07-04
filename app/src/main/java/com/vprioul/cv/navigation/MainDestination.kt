package com.vprioul.cv.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.SportsSoccer
import androidx.compose.ui.graphics.vector.ImageVector
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.feature.contact.ui.navigation.ContactRoute
import com.vprioul.cv.feature.education.ui.navigation.EducationRoute
import com.vprioul.cv.feature.experience.ui.navigation.ExperienceRoute
import com.vprioul.cv.feature.hobbies.ui.navigation.HobbiesRoute
import com.vprioul.cv.feature.home.ui.navigation.HomeRoute
import com.vprioul.cv.feature.skills.ui.navigation.SkillsRoute
import kotlin.reflect.KClass

enum class MainDestination(
    val selectedIconId: ImageVector,
    val unselectedIconId: ImageVector,
    @StringRes val labelId: Int,
    val route: KClass<*>

) {
    HOME_SCREEN(
        selectedIconId = Icons.Default.Home,
        unselectedIconId = Icons.Default.Home,
        labelId = R.string.home_title,
        route = HomeRoute::class
    ),
    EXPERIENCES_SCREEN(
        selectedIconId = Icons.Default.Explore,
        unselectedIconId = Icons.Default.Explore,
        labelId = R.string.experiences_title,
        route = ExperienceRoute::class
    ),
    SKILLS_SCREEN(
        selectedIconId = Icons.Default.Book,
        unselectedIconId = Icons.Default.Book,
        labelId = R.string.skills_title,
        route = SkillsRoute::class
    ),
    EDUCATION_SCREEN(
        selectedIconId = Icons.Default.School,
        unselectedIconId = Icons.Default.School,
        labelId = R.string.education_title,
        route = EducationRoute::class
    ),
    HOBBIES_SCREEN(
        selectedIconId = Icons.Default.SportsSoccer,
        unselectedIconId = Icons.Default.SportsSoccer,
        labelId = R.string.hobbies_title,
        route = HobbiesRoute::class
    ),
    CONTACT_SCREEN(
        selectedIconId = Icons.Default.Person,
        unselectedIconId = Icons.Default.Person,
        labelId = R.string.contact_title,
        route = ContactRoute::class
    )
}
