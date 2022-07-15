package com.lugares_v.repository

/*import androidx.lifecycle.LiveData
import com.lugares_v.data.LugarDao
import com.lugares_v.model.Lugar

class LugarRepository(private val lugarDao: LugarDao) {

    suspend fun addLugar(lugar: Lugar) {
        lugarDao.addLugar(lugar)
    }

    suspend fun updateLugar(lugar: Lugar){
        lugarDao.updateLugar(lugar)
    }

    suspend fun deleteLugar(lugar: Lugar) {
        lugarDao.deleteLugar(lugar)
    }

    val getAllData : LiveData<List<Lugar>> = lugarDao.getAllData()
}*/

import androidx.lifecycle.MutableLiveData
import com.lugares_v.data.LugarDao
import com.lugares_v.model.Lugar

class LugarRepository(private val lugarDao: LugarDao) {
    val getAllData : MutableLiveData<List<Lugar>> = lugarDao.getLugares()

    fun addLugar(lugar: Lugar) {
        lugarDao.saveLugar(lugar)
    }

    fun updateLugar(lugar: Lugar) {
        lugarDao.saveLugar(lugar)
    }

    fun deleteLugar(lugar: Lugar){
        lugarDao.deleteLugar(lugar)
    }
}
