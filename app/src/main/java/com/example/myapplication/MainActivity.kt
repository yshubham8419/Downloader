package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import dev.playground.app.RallyApp
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            
        }
    }
}
@Composable
fun myApp(){
	Column(){
		header()
		screen()
		footer()
	}
}
@Composable
fun header(){
	Text("this is header")
}
@Composable
fun footer(){
	Text("this is footer")
}
@Composable
fun screen(){
	Text("this is screen")
}
