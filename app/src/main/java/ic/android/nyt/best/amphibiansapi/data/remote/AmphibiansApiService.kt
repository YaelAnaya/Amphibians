package ic.android.nyt.best.amphibiansapi.data.remote

import retrofit2.Response
// Base URL for the Amphibians API
private const val BASE_URL = "https://amphibians.vercel.app/api/v1/"

// TODO: Create a Moshi instance with the Moshi Builder.
private val moshi = null

/**
 * TODO: Create a Retrofit instance with the Retrofit Builder.
 * - Use the Moshi instance to serialize and deserialize JSON.
 * */
private val retrofit = null

/**
 * TODO: Create an interface for the Amphibians API service.
 * - getAmphibians():
 *     - Define a suspending function to get a list of amphibians.
 *     - Use the GET request with the path '/amphibians'.
 *     - Return a Response object wrapping a list of Amphibian objects.
 *
 * - getAmphibianById():
 *    - Define a suspending function to get an amphibian by ID.
 *    - Use the GET request with the path '/amphibians/{id}'.
 *    - Pass the ID as a path parameter.
 *    - Return a Response object wrapping an Amphibian object.
 */


/**
 * Singleton object to access the Amphibians API service.
 */
object AmphibiansApi {
    /**
     * Lazy-initialized [AmphibiansApiService] instance.
     */
}