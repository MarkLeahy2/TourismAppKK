package ie.setu.tourismappkk.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log.i
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import ie.setu.tourismappkk.R
import ie.setu.tourismappkk.databinding.AddActivityBinding

class AddActivity : AppCompatActivity() {

        lateinit var binding: AddActivityBinding



        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            menuInflater.inflate(R.menu.menu_main, menu)
            return super.onCreateOptionsMenu(menu)
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.item_cancel -> {
                    finish()
                }
            }
            return super.onOptionsItemSelected(item)
        }


            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = AddActivityBinding.inflate(layoutInflater)
                //setContentView(binding.root)
                val buttonClick = binding.tourismList
                buttonClick.setOnClickListener() {
                    val intent = Intent(this, TourismListActivity::class.java)
                    startActivity(intent)


                   val rateMe = findViewById<Button>(R.id.rateMe) as Button
                    val ratingBar = findViewById<RatingBar>(R.id.ratingBar) as RatingBar

                    rateMe.setOnClickListener {
                        val getRatingValue = ratingBar. rating
                        Toast.makeText(this@AddActivity, "Rating =" +getRatingValue, Toast.LENGTH_LONG
                            ).show()
                    }
                }


           // binding = AddActivityBinding.inflate(layoutInflater)
            setContentView(binding.root)

            //binding = AddActivityBinding.inflate(layoutInflater)
           // setContentView(binding.root)

            binding.toolbarAdd.title = title
            setSupportActionBar(binding.toolbarAdd)




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
