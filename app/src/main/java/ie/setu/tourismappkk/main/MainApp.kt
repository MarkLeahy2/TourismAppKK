package ie.setu.tourismappkk.main


import android.app.Application
import android.util.Log
import android.util.Log.i
import ie.setu.tourismappkk.models.TourismMemStore
import ie.setu.tourismappkk.models.TourismModel


class MainApp : Application() {
    lateinit var tourismList: ArrayList<TourismModel>
    val tourism = TourismMemStore()
    override fun onCreate() {
        super.onCreate()
        tourismList = ArrayList<TourismModel>()
        Log.i("info", "App started")
        tourismList.add(TourismModel("Kilkenny Castle", "This Castle was built in 1172  to control a fording-point of the River Nore and the junction of several routeways"))
        tourismList.add(TourismModel("Round Tower", "Built in the 9th century, this is 1 of only 2 towers left in Ireland that you can climb."))
        tourismList.add(TourismModel("Black Abbey", "This is a Catholic priory of the Dominican Order, dedicated to the Holy and Undivided Trinity"))
        tourismList.add(TourismModel( "Medieval Mile Museum", "The Medieval Mile Museum, located in the heart of Kilkenny City, houses within the finest example of a medieval church in Ireland."))
        tourismList.add(TourismModel("Design Centre","Based in Kilkenny, thisDesign Centre is part of Kilkenny’s Castle Yard, built in the 1780s by the Butlers, Earls of Ormonde, as the coach houses and stables of historic Kilkenny Castle"))
    }



}
