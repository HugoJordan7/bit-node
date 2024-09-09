package com.example.bitnode.feature.main.data

import com.example.bitnode.common.base.RequestCallback
import com.example.bitnode.model.Node

interface NodeDataSource {
    suspend fun findNodes(callback: RequestCallback<List<Node>>)
}