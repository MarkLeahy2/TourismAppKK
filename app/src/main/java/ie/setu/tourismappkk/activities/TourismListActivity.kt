package ie.setu.tourismappkk.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTourismListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        app = application as MainApp

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = TourismAdapter(app.tourismList)
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

