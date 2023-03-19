package ie.setu.tourismappkk.models

import android.location.Location

class TourismMemStore {

    val tourism = ArrayList<TourismModel>()

    override fun findAll(): List<TourismModel> {
        return tourism
    }

    override fun create(tourism: TourismModel) {
        tourism.add(tourism)
    }
    override fun create(Location: TourismModel) {
        Location.add(Location)
        logAll()
    }

    fun logAll() {
        Location.forEach{ i("${it}") }
    }
}

