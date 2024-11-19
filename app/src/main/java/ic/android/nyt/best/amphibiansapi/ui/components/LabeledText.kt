package ic.android.nyt.best.amphibiansapi.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.core.text.buildSpannedString

@Composable
fun LabeledText(
    modifier: Modifier = Modifier,
    label: String,
    text: String
) {
    val annotatedString = buildAnnotatedString {
        withStyle(
            style = MaterialTheme.typography.labelLarge.toSpanStyle().copy(
                fontWeight = FontWeight.SemiBold
            ),
        ) {
            append("$label: ")
        }
        withStyle(
            style = MaterialTheme.typography.bodyMedium.toSpanStyle()
        ) {
            append(text)
        }
    }

    Text(
        modifier = modifier,
        text = annotatedString
    )
}