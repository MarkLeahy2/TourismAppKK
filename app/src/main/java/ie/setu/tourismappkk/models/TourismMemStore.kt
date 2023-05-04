package ie.setu.tourismappkk.models

import android.location.Location
import android.util.Log
import android.util.Log.i

class TourismMemStore: TourismStore {

    private val tourismList = ArrayList<TourismModel>()

    override fun findAll(): List<TourismModel> {
        return tourismList
    }

    //override fun create(tourism: TourismModel) {
       // tourism.add(tourism)
   // }
    override fun create(touristAttraction: TourismModel) {
        tourismList.add(touristAttraction)
        logAll()
    }
    override fun update(touristAttraction: TourismModel) {
        var foundLocation: TourismModel? =tourismList.find { p -> p.id == touristAttraction.id }
        if (foundLocation != null) {
            foundLocation.title = touristAttraction.title
            foundLocation.description = touristAttraction.description
            logAll()
        }
    }
    fun logAll() {
        tourismList.forEach{ Log.i("info","${it}") }
    }
    fun filterName(name:String): List<TourismModel>{
        return tourismList.filter { s -> s.title.startsWith(name) }
    }
}

