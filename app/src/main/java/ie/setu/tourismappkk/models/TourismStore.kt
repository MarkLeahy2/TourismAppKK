package ie.setu.tourismappkk.models

interface TourismStore {
    fun findAll(): List<TourismModel>
    fun create(tourism: TourismModel)
    fun update(tourism: TourismModel)

}