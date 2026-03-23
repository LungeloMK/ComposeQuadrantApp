package com.example.question3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.question3.ui.theme.Question3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Question3Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    QuadrantScreen()
                }
            }
        }
    }
}
@Composable
fun QuadrantScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCard(
                title = stringResource(R.string.text_title),
                description = stringResource(R.string.text_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            QuadrantCard(
                title = stringResource(R.string.image_title),
                description = stringResource(R.string.image_description),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCard(
                title = stringResource(R.string.row_title),
                description = stringResource(R.string.row_description),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            QuadrantCard(
                title = stringResource(R.string.column_title),
                description = stringResource(R.string.column_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}
@Composable
fun QuadrantCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(text = description)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    Question3Theme {
        QuadrantScreen()
    }
}