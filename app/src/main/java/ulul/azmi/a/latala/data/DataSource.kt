package ulul.azmi.a.latala.data

import ulul.azmi.a.latala.R
import ulul.azmi.a.latala.model.Topic

// Object 'DataSource' digunakan untuk menyediakan data topik yang akan ditampilkan di aplikasi
object DataSource {
    // 'topics' adalah daftar (list) yang berisi objek-objek 'Topic'
    val topics = listOf(
        Topic(R.string.architecture, 58, R.drawable.architecture),  // Topik: Arsitektur
        Topic(R.string.automotive, 30, R.drawable.automotive),      // Topik: Otomotif
        Topic(R.string.biology, 90, R.drawable.biology),            // Topik: Biologi
        Topic(R.string.crafts, 121, R.drawable.crafts),             // Topik: Kerajinan
        Topic(R.string.business, 78, R.drawable.business),          // Topik: Bisnis
        Topic(R.string.culinary, 118, R.drawable.culinary),         // Topik: Kuliner
        Topic(R.string.design, 423, R.drawable.design),             // Topik: Desain
        Topic(R.string.ecology, 28, R.drawable.ecology),            // Topik: Ekologi
        Topic(R.string.engineering, 67, R.drawable.engineering),    // Topik: Teknik
        Topic(R.string.fashion, 92, R.drawable.fashion),            // Topik: Fashion
        Topic(R.string.finance, 100, R.drawable.finance),           // Topik: Keuangan
        Topic(R.string.film, 165, R.drawable.film),                 // Topik: Film
        Topic(R.string.gaming, 37, R.drawable.gaming),              // Topik: Gaming
        Topic(R.string.geology, 290, R.drawable.geology),           // Topik: Geologi
        Topic(R.string.drawing, 326, R.drawable.drawing),           // Topik: Menggambar
        Topic(R.string.history, 189, R.drawable.history),           // Topik: Sejarah
        Topic(R.string.journalism, 96, R.drawable.journalism),      // Topik: Jurnalisme
        Topic(R.string.law, 58, R.drawable.law),                    // Topik: Hukum
        Topic(R.string.lifestyle, 305, R.drawable.lifestyle),       // Topik: Gaya Hidup
        Topic(R.string.music, 212, R.drawable.music),               // Topik: Musik
        Topic(R.string.painting, 172, R.drawable.painting),         // Topik: Melukis
        Topic(R.string.photography, 321, R.drawable.photography),   // Topik: Fotografi
        Topic(R.string.physics, 41, R.drawable.physics),            // Topik: Fisika
        Topic(R.string.tech, 118, R.drawable.tech),                 // Topik: Teknologi
    )
}
