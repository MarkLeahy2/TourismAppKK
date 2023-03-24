package ie.setu.tourismappkk.models

import android.location.Location

class TourismMemStore: TourismStore {

    private val tourism = ArrayList<TourismModel>()

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
    override fun update(tourism: TourismModel) {
        var foundLocation: TourismModel? = Location.find { p -> p.id == Location.id }
        if (foundLocation != null) {
            foundLocation.title = tourism.title
            foundLocation.description = tourism.description
            logAll()
        }
    }
    fun logAll() {
        Location.forEach{ i("${it}") }
    }
}

