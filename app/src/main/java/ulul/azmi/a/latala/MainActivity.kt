package ulul.azmi.a.latala

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ulul.azmi.a.latala.data.DataSource
import ulul.azmi.a.latala.model.Topic
import ulul.azmi.a.latala.ui.theme.GridTheme

// Kelas utama yang mewakili aktivitas
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge() // Mengaktifkan mode edge-to-edge untuk UI yang lebih immersive
        super.onCreate(savedInstanceState)
        
        // Mengatur konten menggunakan tema khusus
        setContent {
            GridTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize() // Mengisi seluruh layar
                        .statusBarsPadding(), // Menambahkan padding di area status bar
                    color = MaterialTheme.colorScheme.background // Warna latar belakang dari tema
                ) {
                    // Memanggil fungsi TopicGrid untuk menampilkan grid
                    TopicGrid(
                        modifier = Modifier.padding(
                            start = dimensionResource(R.dimen.padding_small),
                            top = dimensionResource(R.dimen.padding_small),
                            end = dimensionResource(R.dimen.padding_small),
                        )
                    )
                }
            }
        }
    }
}

// Fungsi untuk menampilkan grid menggunakan LazyVerticalGrid
@Composable
fun TopicGrid(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // Grid dengan 2 kolom tetap
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)), // Spasi vertikal antar elemen
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)), // Spasi horizontal antar elemen
        modifier = modifier
    ) {
        // Menampilkan setiap item di grid
        items(DataSource.topics) { topic ->
            TopicCard(topic) // Memanggil kartu untuk setiap topik
        }
    }
}

// Fungsi untuk menampilkan kartu dengan konten topik tertentu
@Composable
fun TopicCard(topic: Topic, modifier: Modifier = Modifier) {
    Card {
        Row {
            Box {
                Image(
                    painter = painterResource(id = topic.imageRes), // Gambar dari resource
                    contentDescription = null, // Tidak ada deskripsi konten
                    modifier = modifier
                        .size(width = 68.dp, height = 68.dp) // Ukuran gambar
                        .aspectRatio(1f), // Rasio aspek 1:1
                    contentScale = ContentScale.Crop // Memotong gambar agar pas
                )
            }

            Column {
                // Teks nama topik
                Text(
                    text = stringResource(id = topic.name),
                    style = MaterialTheme.typography.bodyMedium, // Menggunakan gaya teks dari tema
                    modifier = Modifier.padding(
                        start = dimensionResource(R.dimen.padding_medium),
                        top = dimensionResource(R.dimen.padding_medium),
                        end = dimensionResource(R.dimen.padding_medium),
                        bottom = dimensionResource(R.dimen.padding_small)
                    )
                )
                
                // Ikon dan jumlah kursus yang tersedia
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.ic_grain), // Ikon dari resource
                        contentDescription = null, // Tidak ada deskripsi
                        modifier = Modifier
                            .padding(start = dimensionResource(R.dimen.padding_medium))
                    )
                    Text(
                        text = topic.availableCourses.toString(), // Menampilkan jumlah kursus
                        style = MaterialTheme.typography.labelMedium, // Gaya teks label
                        modifier = Modifier.padding(start = dimensionResource(R.dimen.padding_small))
                    )
                }
            }
        }
    }
}

// Fungsi untuk menampilkan preview dari kartu topik
@Preview(showBackground = true) 
@Composable
fun TopicPreview() {
    GridTheme {
        // Membuat objek topik contoh untuk ditampilkan di preview
        val topic = Topic(R.string.photography, 321, R.drawable.photography)
        
        // Menampilkan kartu topik di tengah layar
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TopicCard(topic = topic)
        }
    }
}
