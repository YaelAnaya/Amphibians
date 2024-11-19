package ic.android.nyt.best.amphibiansapi.presentation.screens.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier
) {
    val vm : DetailViewModel = viewModel()
    val state by vm.state.collectAsState()

    DetailScreenContent(
        modifier = modifier,
        state = state,
        onRetry = { vm.fetchAmphibian() }
    )
}

@Composable
private fun DetailScreenContent(
    modifier: Modifier = Modifier,
    state: DetailUIState,
    onRetry: () -> Unit
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        // TODO: Handle the Loading, Error and Success states

    }
}

// TODO: Uncomment the following code after implementing the DetailViewModel and DetailState.
//@Composable
//fun AmphibianCard(
//    modifier: Modifier = Modifier,
//    amphibian: Amphibian
//) {
//    Card(
//        modifier = modifier.padding(8.dp),
//        shape = MaterialTheme.shapes.medium,
//    ) {
//        Column(
//            modifier = Modifier.fillMaxWidth().padding(18.dp),
//            verticalArrangement = Arrangement.Top
//        ) {
//            AsyncImage(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(bottom = 14.dp)
//                    .clip(MaterialTheme.shapes.medium),
//                model = ImageRequest.Builder(context = LocalContext.current)
//                    .data(amphibian.imgSrc)
//                    .crossfade(true)
//                    .build(),
//                contentDescription = null,
//                contentScale = ContentScale.FillWidth,
//                error = painterResource(id = R.drawable.ic_broken_image),
//                placeholder = painterResource(id = R.drawable.loading_img)
//            )
//            Text(
//                text = amphibian.name,
//                style = MaterialTheme.typography.titleMedium,
//                fontWeight = FontWeight.Bold,
//            )
//
//            Text(
//                modifier = Modifier.padding(vertical = 8.dp),
//                text = amphibian.description,
//                style = MaterialTheme.typography.bodyMedium,
//                textAlign = TextAlign.Justify,
//                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.67f)
//
//            )
//            LabeledText(
//                modifier = Modifier.padding(vertical = 8.dp),
//                label = "Type",
//                text = amphibian.type
//            )
//            LabeledText(
//                modifier = Modifier.padding(vertical = 8.dp),
//                label = "Scientific Name",
//                text = amphibian.scientificName
//            )
//            LabeledText(
//                modifier = Modifier.padding(vertical = 8.dp),
//                label = "Habitat",
//                text = amphibian.habitat
//            )
//            LabeledText(
//                modifier = Modifier.padding(vertical = 8.dp),
//                label = "Diet",
//                text = amphibian.diet
//            )
//        }
//    }
//}