package com.example.bitnode.service

import com.example.bitnode.model.Node
import retrofit2.http.GET

interface NodeService {

    @GET("lightning/nodes/rankings/connectivity")
    suspend fun findNodes(): List<Node>

}

