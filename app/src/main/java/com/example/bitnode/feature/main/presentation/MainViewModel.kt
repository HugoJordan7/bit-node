package com.example.bitnode.feature.main.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bitnode.base.RequestCallback
import com.example.bitnode.feature.main.data.NodeRepository
import com.example.bitnode.model.Node
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(private val repository: NodeRepository): ViewModel() {

    val nodes: StateFlow<List<Node>> get() = _nodes
    private val _nodes = MutableStateFlow(emptyList<Node>())

    val isFailure: StateFlow<Boolean> get() = _isFailure
    private val _isFailure = MutableStateFlow(false)

    val errorMessage: StateFlow<String> get() = _errorMessage
    private val _errorMessage = MutableStateFlow("")

    val isLoading: StateFlow<Boolean> get() = _isLoading
    private val _isLoading = MutableStateFlow(false)

    fun findNodes(){
        viewModelScope.launch {
            _isLoading.emit(true)

            repository.findNodes(object : RequestCallback<List<Node>>{

                override fun onSuccess(data: List<Node>) {
                    viewModelScope.launch {
                        _nodes.emit(data)
                    }
                }

                override fun onFailure(message: String) {
                    viewModelScope.launch {
                        _isFailure.emit(true)
                        _errorMessage.emit(message)
                    }
                }

                override fun onComplete() {
                    viewModelScope.launch {
                        _isLoading.emit(false)
                    }
                }

            })
        }
    }

}