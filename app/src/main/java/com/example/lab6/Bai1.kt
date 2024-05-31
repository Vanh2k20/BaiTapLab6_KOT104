package com.example.lab6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil.compose.AsyncImage

@Composable
fun Bai1(){
    MovieScreen(listMovies = Movie.getSampleMovies())
}

@Composable
fun MovieScreen(listMovies: List<Movie>){
    LazyRow(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 36.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(listMovies.size) {index ->
            MovieItem(movie = listMovies[index])
        }
    }
}

@Composable
fun MovieItem(movie: Movie){
    Card(
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier
                .width(175.dp)
                .height(330.dp)
        ) {
            AsyncImage(
                model = movie.posterUrl,
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(255.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(topEnd = 8.dp, topStart = 8.dp))
                )

            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = movie.title, style = MaterialTheme.typography.titleSmall, maxLines = 2)
                Text(text = "Time : ${movie.year}", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}