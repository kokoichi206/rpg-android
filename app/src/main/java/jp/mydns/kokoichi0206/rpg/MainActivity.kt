package jp.mydns.kokoichi0206.rpg

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import jp.mydns.kokoichi0206.rpg.presentation.map.Map
import jp.mydns.kokoichi0206.rpg.ui.theme.RpgTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val windowMetrics = this.windowManager.currentWindowMetrics
        setContent {
            RpgTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Map(
                        windowHeight = windowMetrics.bounds.height().toFloat(),
                    )
                }
            }
        }
    }
}
