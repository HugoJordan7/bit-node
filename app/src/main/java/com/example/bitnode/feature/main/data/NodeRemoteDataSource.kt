package com.example.bitnode.feature.main.data

import com.example.bitnode.common.base.RequestCallback
import com.example.bitnode.model.Node
import com.example.bitnode.service.NodeService

class NodeRemoteDataSource(private val nodeService: NodeService): NodeDataSource {

    override suspend fun findNodes(callback: RequestCallback<List<Node>>) {
        try {
            val nodes = nodeService.findNodes()
//            callback.onSuccess(nodes)
            callback.onFailure("Test Custom Error")
        } catch (e: Exception){
            callback.onFailure(e.message ?: "Unknown error")
        } finally {
            callback.onComplete()
        }
    }

}