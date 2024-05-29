package utils

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font

actual class FontLoader actual constructor() {
    actual fun loadInterFontFamily(): FontFamily {
        return FontFamily(
            Font("font/inter_bold.ttf", FontWeight.Bold),
            Font("font/inter_medium.ttf", FontWeight.Medium),
            Font("font/inter_regular.ttf", FontWeight.Normal),
            Font("font/inter_semibold", FontWeight.SemiBold),
            Font("font/inter_light", FontWeight.Light),
            Font("font/inter_extralight", FontWeight.ExtraLight)
        )
    }

    actual fun loadEloquiaFontFamily(): FontFamily {
        return FontFamily(
            Font("font/eloquia_extra_bold", FontWeight.ExtraBold),
            Font("font/eloquia_extra_light", FontWeight.Light)
        )
    }
}