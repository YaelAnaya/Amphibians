package ic.android.nyt.best.amphibiansapi.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import ic.android.nyt.best.amphibiansapi.presentation.navigation.AppNavigation
import ic.android.nyt.best.amphibiansapi.presentation.navigation.Home
import ic.android.nyt.best.amphibiansapi.ui.components.TopAppBar

/**
 * Composable function that sets up the main structure of the Amphibians app.
 *
 * @param modifier Modifier to be applied to the Scaffold.
 * @param navHostController Controller to handle navigation within the app.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AmphibiansApp(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController()
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    val backStack by navHostController.currentBackStackEntryAsState()

    // Determine if the back button can be shown
    val canBack = backStack?.destination?.hasRoute<Home>() == false

    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            // Top app bar with back navigation
            TopAppBar(
                scrollBehavior = scrollBehavior,
                canBack = canBack,
                onBack = { navHostController.popBackStack() }
            )
        }
    ) { innerPadding ->
        // Set up the navigation for the app
        AppNavigation(
            modifier = modifier.padding(innerPadding),
            navHostController = navHostController
        )
    }
}