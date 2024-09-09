package com.example.bitnode.feature.main.view

import android.os.Bundle
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bitnode.R
import com.example.bitnode.common.view.ProgressBar
import com.example.bitnode.feature.main.presentation.MainViewModel
import com.example.bitnode.model.Node
import com.example.bitnode.ui.theme.BitNodeTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.findNodes()
        setContent {
            BitNodeTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_bitcoin),
                        contentDescription = "",
                        tint = Color(0xFFB4A414),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(160.dp)
                            .padding(15.dp)
                    )
                    Nodes()
                }
            }
        }
    }

    @Composable
    fun Nodes(){
        Box(modifier = Modifier.fillMaxSize()) {
            val isLoading: Boolean = viewModel.isLoading.collectAsState().value
            val isFailure: Boolean = viewModel.isFailure.collectAsState().value
            val errorMessage: String = viewModel.errorMessage.collectAsState().value
            val nodes: List<Node> = viewModel.nodes.collectAsState().value

            if (nodes.isNotEmpty()) {
                LazyColumn {
                    items(nodes){ node ->
                        NodeItem(node)
                    }
                }
            }

            if (isLoading) {
                ProgressBar()
            }

            if (isFailure) {
                Toast.makeText(this@MainActivity, errorMessage, Toast.LENGTH_LONG).show()
            }

            FloatingActionButton(
                onClick = { viewModel.findNodes() },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(20.dp),
                containerColor = Color.LightGray
            ) {
                Icon(painter = painterResource(id = R.drawable.ic_refresh), contentDescription = "")
            }

        }
    }

}