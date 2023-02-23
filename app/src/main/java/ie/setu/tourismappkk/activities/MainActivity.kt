package ie.setu.tourismappkk.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import ie.setu.tourismappkk.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun clickMe(v : View) {
        Toast.makeText(this,
            "Logging in",
            Toast.LENGTH_LONG).show()
    }

}