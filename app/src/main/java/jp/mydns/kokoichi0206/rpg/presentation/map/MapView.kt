package jp.mydns.kokoichi0206.rpg.presentation.map

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import jp.mydns.kokoichi0206.rpg.presentation.utils.Config

// マップのComposable。
@Composable
fun Map(
    windowHeight: Float,
    viewModel: MapViewModel = viewModel(),
) {
    val screenHeight = with(LocalDensity.current) {
        windowHeight.toDp()
    }

    // appBarを非表示にする。
    val systemUiController = rememberSystemUiController()
    systemUiController.isStatusBarVisible = false

    // 1ブロックの大きさ。
    val size = screenHeight / Config.MAP_NUM_COLUMNS

    Column {
        viewModel.currentFields.forEach { columns ->
            Row {
                Spacer(modifier = Modifier.weight(1f))
                columns.forEach { field ->
                    OneBlock(drawableId = field.drawableId, width = size)
                }
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}

// 1ブロックのComposable。
@Composable
fun OneBlock(drawableId: Int, width: Dp) {
    Image(
        painter = painterResource(id = drawableId),
        contentDescription = null,
        modifier = Modifier
            .height(width)
            .width(width)
    )
}
