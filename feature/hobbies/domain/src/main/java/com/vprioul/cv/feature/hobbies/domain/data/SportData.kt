package com.vprioul.cv.feature.hobbies.domain.data

import com.vprioul.cv.core.resources.R
import com.vprioul.cv.feature.hobbies.domain.model.Sport

object SportData {
    val sports: List<Sport> = listOf(
        Sport(R.string.hobbies_sports_foot, R.drawable.ic_football, R.string.hobbies_sports_foot_bio),
        Sport(R.string.hobbies_sports_run, R.drawable.ic_running, R.string.hobbies_sports_run_bio),
        Sport(R.string.hobbies_sports_dive, R.drawable.ic_diving, R.string.hobbies_sports_dive_bio),
        Sport(R.string.hobbies_sports_padel, R.drawable.ic_padel, R.string.hobbies_sports_padel_bio),
        Sport(R.string.hobbies_sports_surf, R.drawable.ic_surf, R.string.hobbies_sports_surf_bio),
        Sport(R.string.hobbies_sports_bike, R.drawable.ic_bike, R.string.hobbies_sports_bike_bio),
        Sport(R.string.hobbies_sports_swim, R.drawable.ic_swimming, R.string.hobbies_sports_swim_bio),
        Sport(R.string.hobbies_sports_ski, R.drawable.ic_ski, R.string.hobbies_sports_ski_bio),
        Sport(R.string.hobbies_sports_wake, R.drawable.ic_wakeboard, R.string.hobbies_sports_wake_bio),
        Sport(R.string.hobbies_sports_squash, R.drawable.ic_squash, R.string.hobbies_sports_squash_bio),
    )
}
