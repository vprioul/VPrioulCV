package com.vprioul.cv.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.vprioul.cv.navigation.MainDestination
import com.vprioul.cv.navigation.MainNavHost
import com.vprioul.cv.navigation.MainNavigation
import com.vprioul.cv.navigation.MainNavGraph
import com.vprioul.cv.core.designsystem.component.VPrioulCVNavigationBar
import com.vprioul.cv.core.designsystem.component.VPrioulCVNavigationBarItem

@Composable
fun MainScreen(
    navigation: MainNavigation,
    modifier: Modifier = Modifier
) {
    modifier.padding(12.dp)
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val destination = navBackStackEntry?.destination
            val parent = navController.currentDestination?.parent

            VPrioulCVNavigationBar {
                MainDestination.entries.forEach { item ->
                    val selectedItem =
                        destination?.hierarchy?.any { it.hasRoute(item.route) } == true
                    val destinationIsInMainNavGraph = parent?.route == MainNavGraph.javaClass.name
                    val destinationIsStartDestinationOfGraph =
                        destination?.route == parent?.startDestinationRoute
                    val graphIsMainNavGraph = parent?.parent?.route == MainNavGraph.javaClass.name

                    val isInMainNavGraph = destinationIsInMainNavGraph || graphIsMainNavGraph
                    val isDestinationOfNavBar =
                        destinationIsStartDestinationOfGraph || destinationIsInMainNavGraph

                    VPrioulCVNavigationBarItem(
                        onclick = {
                            item.route.objectInstance?.let { route ->
                                if (isInMainNavGraph) {
                                    if (!(selectedItem && isDestinationOfNavBar)) {
                                        navController.navigate(route) {
                                            popUpTo(navController.graph.findStartDestination().id) {
                                                saveState = true
                                            }
                                            launchSingleTop = true
                                            restoreState = true
                                        }
                                    }
                                }
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = item.selectedIconId,
                                contentDescription = null
                            )
                        },
                        label = stringResource(item.labelId),
                        selected = { selectedItem }
                    )
                }
            }
        }
    ) { innerPadding ->
        MainNavHost(
            modifier = Modifier
                .padding(bottom = innerPadding.calculateBottomPadding()),
            navController = navController,
            navigation = navigation
        )
    }
}
