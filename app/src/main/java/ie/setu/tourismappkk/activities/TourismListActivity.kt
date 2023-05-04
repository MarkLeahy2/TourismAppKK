package ie.setu.tourismappkk.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.SearchView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ie.setu.tourismappkk.R
import ie.setu.tourismappkk.databinding.ActivityTourismListBinding
import ie.setu.tourismappkk.databinding.CardTourismBinding
import ie.setu.tourismappkk.main.MainApp
import ie.setu.tourismappkk.models.TourismModel


class TourismListActivity : AppCompatActivity() {

    lateinit var app: MainApp
    private lateinit var binding: ActivityTourismListBinding
    //private lateinit var adapter: ArrayAdapter<String>
    private lateinit var adapter: TourismAdapter
    val locationList =
        listOf(
            "Kilkenny Castle",
            "Round Tower",
            "Black Abbey",
            "Medieval Mile Museum",
            "Design Centre"
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTourismListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        app = application as MainApp

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        adapter = TourismAdapter(app.tourismList)
        binding.recyclerView.adapter = adapter
        //binding.recyclerView.adapter = TourismAdapter(app.tourismList.findAll()
        // app.placemarks.add(placemark.copy())
        //app.tourism.create(tourism.copy())



       // setupListView()
        setupSearchView()


    }
    private fun setupListView() {
       // adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, locationList)
       //binding.listView.adapter = adapter
    }

    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener
            //SearchView.OnQueryTextListener
        {
            override fun onQueryTextSubmit(p0: String?): Boolean {
               // val isMatchFound = locationList.contains(p0)
              //  val msg = if (isMatchFound) "Found: $p0" else getString(R.string.no_match)
              //  Toast.makeText(this@TourismListActivity, msg, Toast.LENGTH_SHORT).show()
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                filterList(p0)
                return false
            }
        })
    }

    private fun filterList(p0: String?) {
        if (p0 != null) {
            var newList = app.tourismList.filter { s -> s.title.startsWith(p0) }
            adapter = TourismAdapter(newList as ArrayList<TourismModel>)
            binding.recyclerView.adapter = adapter
            adapter.notifyDataSetChanged()

        }

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }


}
class TourismAdapter constructor(private var tList: ArrayList<TourismModel>) :
    RecyclerView.Adapter<TourismAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val binding = CardTourismBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val tourismObject = tList[holder.adapterPosition]
        holder.bind(tourismObject)
    }

    override fun getItemCount(): Int = tList.size

    class MainHolder(private val binding: CardTourismBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(tObject: TourismModel) {
            binding.tlistTitle.text = tObject.title
            binding.description.text = tObject.description
        }
    }
}

