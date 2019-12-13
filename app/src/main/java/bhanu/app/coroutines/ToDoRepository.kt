package bhanu.app.coroutines

import androidx.lifecycle.LiveData
import com.google.gson.JsonObject

class ToDoRepository {
    suspend fun getTodo(id:Int) = retrofit.getTodo(id)
}