package jp.mydns.kokoichi0206.rpg.presentation.map

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.zIndex
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import jp.mydns.kokoichi0206.rpg.presentation.map.components.Fields
import jp.mydns.kokoichi0206.rpg.presentation.map.components.PlayerView
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

    // バックグラウンドにマップを表示する。
    Fields(
        fields = viewModel.currentFields,
        size = size,
        modifier = Modifier.zIndex(1f),
    )

    // プレイヤーを表示する。
    PlayerView(
        drawableId = viewModel.currentPlayer.drawableState.getDrawable(),
        size = size,
        modifier = Modifier
            .zIndex(2f),
    )
}
