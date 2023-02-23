package ie.setu.tourismappkk.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ie.setu.tourismappkk.R


class TourismListActivity : AppCompatActivity() {

    lateinit var app: MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tourism_list)
    }
}