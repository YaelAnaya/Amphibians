package ic.android.nyt.best.amphibiansapi.presentation.screens.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import ic.android.nyt.best.amphibiansapi.data.repository.AmphibianRepository
import ic.android.nyt.best.amphibiansapi.presentation.navigation.AmphibianDetails
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class DetailUIState(
    val amphibian: Any? = TODO("Make this an Amphibian"),
    val isLoading: Boolean = false,
    val error: String = ""
)

/**
 * TODO: Implement the ViewModel for the Home screen.
 * - Use the savedStateHandle to get the amphibian ID passed from the Home screen.
 * - Use a repository to fetch amphibian detail data and manage the state using StateFlow.
 */
class DetailViewModel : ViewModel() {
    // TODO: Get the amphibian ID.

    // TODO: Create a reference to the AmphibianRepository.

    // Use MutableStateFlow to manage a reactive state in a coroutine scope.
    private val _state = MutableStateFlow(DetailUIState())
    val state = _state.asStateFlow()

    /**
     * TODO: Fetch the amphibian detail data from the repository.
     *
     * - Use the repository to fetch the amphibian detail data.
     * - Use the flow to update the state with the response state (loading, data, error).
     * - Use viewModelScope to launch the flow collection.
     * */
    fun fetchAmphibian() = Unit

}