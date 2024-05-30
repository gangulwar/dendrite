package utils

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font

actual class FontLoader actual constructor() {
    actual fun loadInterFontFamily(): FontFamily {
//        return FontFamily(
//            Font("url(font/inter_bold.ttf)", FontWeight.Bold),
//            Font("url(font/inter_medium.ttf)", FontWeight.Medium),
//            Font("url(font/inter_regular.ttf)", FontWeight.Normal),
//            Font("url(font/inter_semibold.ttf)", FontWeight.SemiBold),
//            Font("url(font/inter_light.ttf)", FontWeight.Light),
//            Font("url(font/inter_extralight.ttf)", FontWeight.ExtraLight)
//        )
    }

    actual fun loadEloquiaFontFamily(): FontFamily {
//        return FontFamily(
//            Font("url(font/eloquia_extra_bold.ttf)", FontWeight.ExtraBold),
//            Font("url(font/eloquia_extra_light.ttf)", FontWeight.Light)
//        )
    }
}