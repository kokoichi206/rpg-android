package jp.mydns.kokoichi0206.rpg.presentation.map.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

/**
 * プレイヤーのComposable。
 */
@Composable
fun PlayerView(
    drawableId: Int,
    size: Dp,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // FIXME: 行と列がともに奇数じゃなければ破綻する。
        Spacer(modifier = Modifier.weight(1f))
        OneBlock(drawableId = drawableId, width = size)
        Spacer(modifier = Modifier.weight(1f))
    }
}
