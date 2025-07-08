package com.vprioul.cv.core.designsystem.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.vprioul.cv.core.designsystem.theme.DpApp
import com.vprioul.cv.core.designsystem.theme.DpLarge
import kotlinx.collections.immutable.ImmutableList
import kotlinx.coroutines.launch
import kotlin.math.abs

@Composable
fun <T> ColumnScope.IconCarousel(
    items: ImmutableList<T>,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight(),
    itemWidth: Dp = DpApp,
    itemHeight: Dp = DpApp,
    spacing: Dp = DpLarge,
    selectedItemContent: (T) -> Unit = {},
    itemContent: @Composable (item: T, isSelected: Boolean) -> Unit
) {
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    val screenWidth = LocalConfiguration.current.screenWidthDp.dp

    val horizontalContentPadding = (screenWidth - itemWidth) / 2

    val centeredIndex by remember {
        derivedStateOf {
            val layoutInfo = listState.layoutInfo
            if (layoutInfo.visibleItemsInfo.isEmpty()) {
                return@derivedStateOf 0
            }

            val viewportCenter = (layoutInfo.viewportStartOffset + layoutInfo.viewportEndOffset) / 2f

            layoutInfo.visibleItemsInfo
                .minByOrNull { item ->
                    val itemCenter = item.offset + item.size / 2f
                    abs(itemCenter - viewportCenter)
                }?.index ?: 0
        }
    }
    LazyRow(
        state = listState,
        contentPadding = PaddingValues(horizontal = horizontalContentPadding),
        horizontalArrangement = Arrangement.spacedBy(spacing),
        modifier = modifier
    ) {
        itemsIndexed(items) { index, item ->
            val isSelected = index == centeredIndex

            LaunchedEffect(isSelected, item) {
                if (isSelected) {
                    selectedItemContent(item)
                }
            }

            LaunchedEffect(listState.isScrollInProgress) {
                if (!listState.isScrollInProgress) {
                    listState.animateScrollToItem(centeredIndex)
                }
            }

            val scale by animateFloatAsState(
                targetValue = if (isSelected) 1.5f else 1f,
                label = "scaleAnimation"
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .size(itemWidth, itemHeight)
                    .graphicsLayer {
                        scaleX = scale
                        scaleY = scale
                    }
                    .clickable {
                        coroutineScope.launch {
                            listState.animateScrollToItem(index)
                        }
                    }
            ) {
                itemContent(item, isSelected)
            }
        }
    }
}
