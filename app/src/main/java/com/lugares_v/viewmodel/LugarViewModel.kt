package com.lugares_v.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.lugares_v.data.LugarDatabase
import com.lugares_v.model.Lugar
import com.lugares_v.repository.LugarRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.lugares_v.data.LugarDao

class LugarViewModel(application: Application) : AndroidViewModel(application) {

   /* //Atributo para acceder al repositorio de Lugar
    private val repository: LugarRepository

    //Atributo para obtener la lista de lugares en un ArrayList especial
    val getAllData: LiveData<List<Lugar>>

    //Bloque de inicialización de los atributos
    init {
        val lugarDao = LugarDatabase.getDataBase(application).lugarDao()
        repository = LugarRepository(lugarDao)
        getAllData = repository.getAllData
    }

    fun addLugar(lugar: Lugar) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addLugar(lugar)
        }
    }

    fun updateLugar(lugar: Lugar) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateLugar(lugar)
        }
    }

    fun deleteLugar(lugar: Lugar) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteLugar(lugar)
        }
    }*/

    private val getAllData : MutableLiveData<List<Lugar>>
    private val repository : LugarRepository = LugarRepository(LugarDao())

    init{
        getAllData = repository.getAllData
    }

    fun addLugar (lugar: Lugar) {viewModelScope.launch(Dispatchers.IO) {repository.addLugar(lugar) }}
    fun updateLugar (lugar: Lugar) {viewModelScope.launch(Dispatchers.IO) {repository.updateLugar(lugar) }}
    fun deleteLugar (lugar: Lugar) {viewModelScope.launch(Dispatchers.IO) {repository.deleteLugar(lugar) }}


}