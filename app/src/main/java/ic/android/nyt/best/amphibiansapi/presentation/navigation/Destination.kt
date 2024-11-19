package ic.android.nyt.best.amphibiansapi.presentation.navigation

import kotlinx.serialization.Serializable

/**
 * Represents the Home destination in the navigation.
 */
@Serializable
object Home

/**
 * Represents the details of an amphibian.
 * @property id The ID of the amphibian.
 */
@Serializable
data class AmphibianDetails(val id: Int)