package com.course.breakingnews.main.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.course.breakingnews.main.App
import com.course.breakingnews.ui.card.BreakingNewsCard
import com.course.breakingnews.ui.content.DetailsContentSection
import com.course.breakingnews.ui.header.DetailsHeaderSection
import com.course.breakingnews.ui.top.BreakingNewsTopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT
            ),
            navigationBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT,
            )
        )

        setContent {
            App()
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun ComponentPreview(){
    Column {
        BreakingNewsTopBar(onClick = {})
        BreakingNewsCard(
            title = "5 teste teste teste testeteste testeteste teste ",
            author = "Leonardo Jesus",
            date = "Sunday 9 May 2021 ",
            onClick = {}
        )
        DetailsHeaderSection (onClick = {})

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
}*/

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}

