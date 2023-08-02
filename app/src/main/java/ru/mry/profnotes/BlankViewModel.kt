package ru.mry.profnotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class BlankViewModel : ViewModel() {
    val itemsFlow: MutableStateFlow<List<String>> = MutableStateFlow(emptyList())

    init {
        val apiService = Api.apiService
        viewModelScope.launch {
            val items = apiService.getPosts("1")
            Database.postsDao.insert(items.map { PostEntity(it.id, it.userId, it.title, it.body) })
        }
        viewModelScope.launch {
            Database.postsDao.getPostsFlow().collectLatest {
                itemsFlow.emit(it.map(PostEntity::title))
            }
        }
    }
}