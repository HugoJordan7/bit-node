package com.example.bitnode.feature.main.view

import android.os.Bundle
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
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
//            LazyColumn {
//                items(nodes){
//
//                }
//            }
            }

            if (isLoading) {
                ProgressBar()
            }

            if (isFailure) {
                Toast.makeText(this@MainActivity, errorMessage, Toast.LENGTH_LONG).show()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        BitNodeTheme {

        }
    }

}