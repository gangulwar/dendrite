package utils

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.gangulwar.dendrite.R

actual class FontLoader actual constructor() {
    actual fun loadInterFontFamily(): FontFamily {
        return FontFamily(
            Font(R.font.inter_bold, FontWeight.Bold),
            Font(R.font.inter_medium, FontWeight.Medium),
            Font(R.font.inter_regular, FontWeight.Normal),
            Font(R.font.inter_semibold, FontWeight.SemiBold),
            Font(R.font.inter_light, FontWeight.Light),
            Font(R.font.inter_extralight, FontWeight.ExtraLight)
        )
    }

    actual fun loadEloquiaFontFamily(): FontFamily {
        return FontFamily(
            Font(R.font.eloquia_extra_bold, FontWeight.ExtraBold),
            Font(R.font.eloquia_extra_light, FontWeight.Light)
        )
    }
}