package ulul.azmi.a.latala.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Data class untuk mendefinisikan model 'Topic'
data class Topic(
    @StringRes val name: Int,              // ID untuk string resource (nama topik)
    val availableCourses: Int,             // Jumlah kursus yang tersedia dalam topik ini
    @DrawableRes val imageRes: Int          // ID untuk drawable resource (gambar topik)
)
