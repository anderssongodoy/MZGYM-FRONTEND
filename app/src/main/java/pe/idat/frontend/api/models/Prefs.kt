package pe.idat.frontend.api.models

import android.content.Context

class Prefs (val context:Context){
    val SHARED_DB = "GYMDB"
    val SHARED_NOMBRE = ""
    val SHARED_DIRECTION = ""
    val SHARED_PRICE = ""
    val SHARED_APELLIDOS = ""
    val SHARED_DESCRIPCION = ""
    val SHARED_UUID = ""
    val SHARED_ID = ""

    val storage = context.getSharedPreferences(SHARED_DB, 0)

    fun setNombre(nombre:String){
        storage.edit().putString(SHARED_NOMBRE, nombre).apply()
    }

    fun getNombre():String{
        return storage.getString(SHARED_NOMBRE, "")!!
    }

    fun setDirection(direction:String){
        storage.edit().putString(SHARED_DIRECTION, direction).apply()
    }

    fun getDirection():String{
        return storage.getString(SHARED_DIRECTION, "")!!
    }

    fun setPrice(price:Int){
        storage.edit().putInt(SHARED_PRICE, price).apply()
    }

    fun getPrice(price:Int){
        storage.getInt(SHARED_PRICE, 0)
    }

    fun setApellidos(apellidos:String){
        storage.edit().putString(SHARED_APELLIDOS, apellidos).apply()
    }

    fun getApellidos(apellidos: String){
        storage.getString(SHARED_APELLIDOS, "")!!
    }

    fun setDescripcion(descripcion:String){
        storage.edit().putString(SHARED_DESCRIPCION, descripcion).apply()
    }
}