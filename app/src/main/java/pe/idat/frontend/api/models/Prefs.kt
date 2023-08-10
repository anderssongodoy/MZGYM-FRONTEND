package pe.idat.frontend.api.models

import android.content.Context

class Prefs (val context:Context){
    val SHARED_DB = "GYMDB"
    val SHARED_NOMBRE = ""
    val SHARED_LOCATION = ""
    val SHARED_PRICE = ""
    val SHARED_APELLIDOS = ""
    val SHARED_DESCRIPCION = ""
    val SHARED_UUID = ""
    val SHARED_ID = ""

    val storage = context.getSharedPreferences(SHARED_DB, 0)

    fun setNombre(nombre:String){
        storage
    }
}