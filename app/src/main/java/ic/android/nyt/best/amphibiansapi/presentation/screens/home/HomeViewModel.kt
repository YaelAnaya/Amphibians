package ic.android.nyt.best.amphibiansapi.presentation.screens.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class HomeUIState(
    val isLoading: Boolean = false,
    val amphibians: List<Any> = TODO("Make this a List of Amphibians"),
    val error: String = ""
)

/**
 * TODO: Implement the ViewModel for the Home screen.
 * - HINT: Use a repository to fetch amphibians and manage the state using StateFlow.
 */
class HomeViewModel : ViewModel() {
    // Access the repository object.

    // Use MutableStateFlow to manage a reactive state in a coroutine scope.
    private val _state = MutableStateFlow(HomeUIState())
    val state = _state.asStateFlow()

    /**
     * TODO: Fetch the list of amphibians from the repository.
     *
     * - Use the repository to fetch the amphibians.
     * - Use the flow to update the state with the response state (loading, data, error).
     * - Use viewModelScope to launch the flow collection.
     * */
    fun fetchAmphibians() = Unit
}