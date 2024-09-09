package com.example.bitnode.model

import com.google.gson.annotations.SerializedName

data class Node(
    val publicKey: String,
    val alias: String,
    val channels: Int,
    val capacity: Long,
    val firstSeen: Long,
    val updatedAt: Long,
    val city: City?,
    val country: Country,
    @SerializedName("iso_code") val isoCode: String,
    val subdivision: String?
)