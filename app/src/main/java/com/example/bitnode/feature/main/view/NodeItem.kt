package com.example.bitnode.feature.main.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.bitnode.model.Node

@Composable
fun NodeItem(node: Node) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)
        .border(3.dp, Color(0xFFB4A414), RoundedCornerShape(20.dp))
        .background(Color.Yellow, RoundedCornerShape(20.dp))
        .padding(horizontal = 15.dp, vertical = 10.dp)

    ){
        CustomText(text = "Chave Pública: " + node.publicKey)
        CustomText(text = "Pseudônimo: " + node.alias)
        CustomText(text = "Canais: " + node.channels)
        CustomText(text = "Capacidade: " + node.capacity)
        CustomText(text = "Visto primeiro em: " + node.firstSeen)
        CustomText(text = "Atualizado em: " + node.updatedAt)
        node.city?.let { 
            CustomText(text = "Cidade: " + it.ptBR)
        }
        CustomText(text = "Continente: " + node.country.ptBR)
    }
}

@Composable
fun CustomText(text: String){
    Text(
        text = text,
        textAlign = TextAlign.Start,
        color = Color.Black,
        maxLines = 2,
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding()
    )
}