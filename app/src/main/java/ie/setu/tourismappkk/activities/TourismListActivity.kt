package ie.setu.tourismappkk.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import ie.setu.tourismappkk.R
import ie.setu.tourismappkk.databinding.ActivityTourismListBinding
import ie.setu.tourismappkk.main.MainApp
import ie.setu.tourismappkk.models.TourismModel


class TourismListActivity : AppCompatActivity() {

    lateinit var app: MainApp
    private lateinit var binding: ActivityTourismListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTourismListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        app = application as MainApp

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
       // binding.recyclerView.adapter = TourismAdapter(app.tourismList)
    }


override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }


}
class TourismAdapter constructor(private var tList: ArrayList<TourismModel>) :
    RecyclerView.Adapter<TourismAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val binding = CardPlacemarkBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val placemark = placemarks[holder.adapterPosition]
        holder.bind(placemark)
    }

    override fun getItemCount(): Int = placemarks.size

    class MainHolder(private val binding : CardTourismBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(placemark: TourismModel) {
            binding.placemarkTitle.text = placemark.title
            binding.description.text = placemark.description
        }
    }
}