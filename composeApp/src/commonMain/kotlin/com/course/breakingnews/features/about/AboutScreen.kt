package com.course.breakingnews.features.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.course.breakingnews.plataform.Plataform

@Composable
fun AboutScreen(
    onBackPressed: ()->  Unit
){
    LazyColumn(modifier = Modifier.fillMaxSize().padding(top = 16.dp)){
        items(makeItems()){ item->
            AboutComponent(
                title = item.first,
                subTitle = item.second,

            )
        }

        item {
            Row(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.Black
                    ),
                    onClick = {
                        onBackPressed.invoke()
                    }
                ){
                    Text("Voltar")
                }
            }

        }
    }

}

@Composable
private fun AboutComponent(
    title : String,
    subTitle:String,
){
    Column( modifier =  Modifier.padding(16.dp)){
        Text(
            text = title,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = subTitle,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

    }
    HorizontalDivider()

}

private fun makeItems():List<Pair<String,String>>{
    val plataform = Plataform()
    return listOf(
        Pair("Sistema operacional", "${plataform.osName} ${plataform.onVersion}"),
        Pair("Dispositivo", plataform.deviceModel)
    )
}