package bhanu.app.coroutines

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class MainViewModel():ViewModel() {
    private val tag = "MainViewModel"
    private val todoRepo = ToDoRepository()
    val firstTodo = liveData(Dispatchers.IO){
        try {
            val data = todoRepo.getTodo(1)
            emit(data)
        } catch (e: Exception) {
            Log.e(tag,"error: "+e.localizedMessage)
        }
    }
}