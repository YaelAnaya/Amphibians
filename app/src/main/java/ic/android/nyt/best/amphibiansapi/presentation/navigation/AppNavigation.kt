package ic.android.nyt.best.amphibiansapi.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ic.android.nyt.best.amphibiansapi.presentation.screens.detail.DetailScreen
import ic.android.nyt.best.amphibiansapi.presentation.screens.home.HomeScreen

/**
 * Composable function that sets up the navigation for the app.
 *
 * @param modifier Modifier to be applied to the NavHost.
 * @param navHostController Controller to handle navigation within the NavHost.
 */
@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navHostController,
        startDestination = Home,
        modifier = modifier
    ) {
        // Defining the content of the Home destination
        composable<Home> {
            HomeScreen(
                onAmphibianClick = { id ->
                    navHostController.navigate(AmphibianDetails(id))
                }
            )
        }

        // Defining the content of the AmphibianDetails destination
        composable<AmphibianDetails> {
            DetailScreen()
        }
    }
}