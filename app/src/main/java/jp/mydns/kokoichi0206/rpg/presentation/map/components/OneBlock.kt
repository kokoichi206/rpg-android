package jp.mydns.kokoichi0206.rpg.presentation.map.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp

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
