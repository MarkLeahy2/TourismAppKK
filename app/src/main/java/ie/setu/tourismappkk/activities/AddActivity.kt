package ie.setu.tourismappkk.activities

import android.os.Bundle
import android.util.Log
import android.util.Log.i
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import ie.setu.tourismappkk.R
import ie.setu.tourismappkk.databinding.ActivityTourismListBinding
import ie.setu.tourismappkk.databinding.AddActivityBinding

class AddActivity {
    class AddActivity : AppCompatActivity() {
        lateinit var binding: AddActivityBinding

        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            menuInflater.inflate(R.menu.menu_main, menu)
            return super.onCreateOptionsMenu(menu)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)


            binding = AddActivityBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding = AddActivityBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.toolbarAdd.title = title
            setSupportActionBar(binding.toolbarAdd)
           /// Timber.plant(Timber.DebugTree())



            i("Info","Tourism App Activity started...")

            binding.btnAdd.setOnClickListener() {
                i("Info","add Button Pressed")
                binding.btnAdd.setOnClickListener() {
                    val TourismTitle = binding.TourismTitle.text.toString()
                    if (TourismTitle.isNotEmpty()) {
                       i("info","add Button Pressed:$TourismTitle")
                    }
                    else {
                        Snackbar
                            .make(it,"Please Enter a location", Snackbar.LENGTH_LONG)
                            .show()
                    }


                }
            }
        }
    }
}