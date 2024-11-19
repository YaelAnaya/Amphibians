package ic.android.nyt.best.amphibiansapi.presentation.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onAmphibianClick: (Int) -> Unit = {}
) {
    val vm : HomeViewModel = viewModel()
    val state by vm.state.collectAsState()

    HomeScreenContent(
        modifier = modifier,
        state = state,
        onAmphibianClick = onAmphibianClick,
        onRetry = { vm.fetchAmphibians() }
    )
}

@Composable
private fun HomeScreenContent(
    modifier: Modifier = Modifier,
    state: HomeUIState,
    onAmphibianClick: (Int) -> Unit,
    onRetry: () -> Unit
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        // TODO: Handle the Loading, Error and Success states
    }
}

// TODO: Uncomment the following code after implementing the HomeViewModel and HomeState.

//
//@Composable
//private fun AmphibianList(
//    modifier: Modifier = Modifier,
//    amphibians: List<Amphibian>,
//    onAmphibianClick: (Int) -> Unit
//) {
//    LazyColumn(
//        modifier = modifier.fillMaxSize(),
//        contentPadding = PaddingValues(22.dp),
//        verticalArrangement = Arrangement.Top,
//    ) {
//        items(items = amphibians) { amphibian ->
//            AmphibianItem(
//                amphibian = amphibian,
//                onClick = { onAmphibianClick(amphibian.id) }
//            )
//        }
//    }
//}
//
//@Composable
//fun AmphibianItem(
//    modifier: Modifier = Modifier,
//    amphibian: Amphibian,
//    onClick: () -> Unit
//) {
//    Card(
//        modifier = modifier,
//        shape = RoundedCornerShape(8.dp),
//        onClick = onClick
//    ) {
//        Column(
//            modifier = Modifier.fillMaxWidth().padding(8.dp),
//            verticalArrangement = Arrangement.Top
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//            ) {
//                Text(
//                    text = amphibian.id.toString(),
//                    style = MaterialTheme.typography.titleMedium,
//                    fontWeight = FontWeight.SemiBold,
//                    textAlign = TextAlign.Start
//                )
//                Text(
//                    text = amphibian.name,
//                    style = MaterialTheme.typography.titleMedium,
//                )
//            }
//        }
//    }
//}