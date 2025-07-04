package com.vprioul.cv.core.designsystem.component

import com.vprioul.cv.core.designsystem.theme.GrayCloud
import com.vprioul.cv.core.designsystem.theme.White
import com.vprioul.cv.core.designsystem.theme.VPrioulCVTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vprioul.cv.core.designsystem.theme.Black
import com.vprioul.cv.core.designsystem.theme.Charcoal

@Composable
fun VPrioulCVNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    Column(modifier = modifier) {
        HorizontalDivider(color = GrayCloud)
        NavigationBar(
            containerColor = White,
            tonalElevation = 0.dp,
            content = content
        )
    }
}

@Composable
fun RowScope.VPrioulCVNavigationBarItem(
    onclick: () -> Unit,
    icon: @Composable () -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    selected: () -> Boolean
) {
    val colors = NavigationBarItemDefaults.colors(
        selectedIconColor = Black,
        selectedTextColor = Black,
        unselectedIconColor = Charcoal,
        unselectedTextColor = Charcoal,
        indicatorColor = Color.Transparent
    )

    val itemSelected = selected()

    NavigationBarItem(
        modifier = modifier.height(IntrinsicSize.Max),
        selected = itemSelected,
        colors = colors,
        onClick = onclick,
        icon = icon,
        alwaysShowLabel = true,
        label = {
            BasicText(
                text = label,
                style = MaterialTheme.typography.bodySmall.copy(
                    fontWeight = if (itemSelected) {
                        FontWeight.Bold
                    } else {
                        FontWeight.Normal
                    },
                    fontSize = if (label.length > 10) {
                        8.sp
                    } else if (label.length > 8) {
                        10.sp
                    } else {
                        12.sp
                    }
                )
            )
        },
    )
}

@Preview
@Composable
private fun VPrioulCVNavigationBarPreview() {
    val items = listOf("Cms1", "Cms2", "cms3")
    val icons = listOf(
        Icons.Filled.Star,
        Icons.Filled.AccountCircle,
        Icons.AutoMirrored.Filled.ExitToApp,
    )
    VPrioulCVTheme {
        VPrioulCVNavigationBar {
            items.forEachIndexed { index, item ->
                VPrioulCVNavigationBarItem(
                    onclick = {},
                    icon = {
                        Icon(
                            imageVector = icons[index],
                            contentDescription = null
                        )
                    },
                    label = item,
                    selected = { index == 0 }
                )
            }
        }
    }
}
