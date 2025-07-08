package com.vprioul.cv.feature.skills.ui.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.vprioul.cv.core.designsystem.component.MinimalText
import com.vprioul.cv.core.designsystem.theme.DpIcon
import com.vprioul.cv.core.designsystem.theme.DpLarge
import com.vprioul.cv.core.designsystem.theme.DpMedium
import com.vprioul.cv.core.ui.ResourcesHelper
import com.vprioul.cv.feature.skills.domain.usecase.model.SkillData
import com.vprioul.cv.feature.skills.ui.viewmodel.SkillsViewModel
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Composable
fun SkillsScreen(
    modifier: Modifier = Modifier,
    viewModel: SkillsViewModel = hiltViewModel()
) {
    val skills by viewModel.uiState.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(DpLarge),
        verticalArrangement = Arrangement.spacedBy(DpLarge)
    ) {
        SkillsGrid(
            skills = skills.toImmutableList()
        )
    }
}

@Composable
private fun SkillsGrid(
    skills: ImmutableList<SkillData>,
) {
    val groupedByCategory = skills.groupBy { it.category }
    val context = LocalContext.current
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(DpMedium),
        verticalArrangement = Arrangement.spacedBy(DpMedium)
    ) {
        groupedByCategory.forEach { (category, skillsInCategory) ->
            item(span = { GridItemSpan(maxLineSpan) }) {
                MinimalText(
                    label = stringResource(category.resources),
                    style = MaterialTheme.typography.titleLarge
                )
            }
            items(skillsInCategory) { skill ->
                Image(
                    modifier = Modifier
                        .size(DpIcon)
                        .clickable {
                            Toast.makeText(context, skill.name, Toast.LENGTH_SHORT).show()
                        },
                    painter = painterResource(ResourcesHelper.getDrawableIdByName(skill.icon)),
                    contentDescription = skill.name
                )
            }
        }
    }
}
