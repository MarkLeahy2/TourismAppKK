package ie.setu.tourismappkk.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import ie.setu.tourismappkk.R
import ie.setu.tourismappkk.databinding.ActivityMainBinding
import ie.setu.tourismappkk.databinding.ActivityTourismListBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val buttonClick = binding.Login
        buttonClick.setOnClickListener() {
            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }


       // setContentView(R.layout.activity_main)
    }
   // private lateinit var binding: ActivityTourismListBinding

    fun clickMe(v: View) {
        Toast.makeText(
            this,
            "Logging in",
            Toast.LENGTH_LONG
        ).show()
    }

}