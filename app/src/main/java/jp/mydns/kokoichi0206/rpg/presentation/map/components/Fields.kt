package jp.mydns.kokoichi0206.rpg.presentation.map.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import jp.mydns.kokoichi0206.rpg.presentation.map.Field

/**
 * マップ（背景のフィールド）のComposable。
 */
@Composable
fun Fields(
    fields: List<List<Field>>,
    size: Dp,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
    ) {
        fields.forEach { columns ->
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
