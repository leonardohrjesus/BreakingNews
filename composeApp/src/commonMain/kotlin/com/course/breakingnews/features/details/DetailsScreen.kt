package com.course.breakingnews.features.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.course.breakingnews.ui.content.DetailsContentSection
import com.course.breakingnews.ui.header.DetailsHeaderSection


@Composable
fun DetailsScreen(
    onBackPressed: ()-> Unit
){
    DetailsContent(onBackPressed = onBackPressed)
}

@Composable
fun DetailsContent(
    onBackPressed: ()-> Unit
) {
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        containerColor = Color.White,
        topBar = {},
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                DetailsHeaderSection(onClick = {onBackPressed.invoke()})

                DetailsContentSection(
                    content = """Londoon  leonardo ecfencjfne teste sisisi muittoo bommm me ajudaaaaa
                |Londoon  leonardo ecfencjfne teste sisisi muittoo bommm me ajudaaaaa
                |Londoon  leonardo ecfencjfne teste sisisi muittoo bommm me ajudaaaaa
                |dcdcvdikjk kdjkldklslcj fjkoncvjdjcvnedn
                |
                |
            """.trimIndent()
                )

            }
            
        }
    )
}