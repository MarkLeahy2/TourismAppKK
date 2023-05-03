package ie.setu.tourismappkk.models

import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

var image: Uri = Uri.EMPTY

@Parcelize
data class TourismModel(var title:String="",
                        var description:String="",
                        var id: Long = 0,
                        var image: Uri = Uri.EMPTY) : Parcelable

@Parcelize
data class Location(var lat: Double = 0.0,
                    var lng: Double = 0.0,
                    var zoom: Float = 0f) : Parcelable






