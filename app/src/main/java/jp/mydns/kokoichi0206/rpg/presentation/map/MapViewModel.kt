package jp.mydns.kokoichi0206.rpg.presentation.map

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import jp.mydns.kokoichi0206.rpg.presentation.utils.Config

/**
 * マップ画面でのViewModel。
 */
class MapViewModel : ViewModel() {
    /**
     * フィールド（背景画像）。
     */
    var currentFields by mutableStateOf<List<List<Field>>>(
        mutableListOf()
    )

    /**
     * プレイヤーの情報。
     */
    var currentPlayer by mutableStateOf(
        Player()
    )

    init {
        updateFields()
    }

    /**
     * プレイヤーの座標を元に周囲に表示すべきマップを用意する。
     */
    private fun updateFields() {
        currentFields = mutableListOf()

        for (y in (currentPlayer.coordinateY - Config.MAP_NUM_COLUMNS / 2) until (currentPlayer.coordinateY - Config.MAP_NUM_COLUMNS / 2 + Config.MAP_NUM_COLUMNS)) {
            val row = mutableListOf<Field>()
            for (x in (currentPlayer.coordinateX - Config.MAP_NUM_ROWS / 2) until currentPlayer.coordinateX - Config.MAP_NUM_ROWS / 2 + Config.MAP_NUM_ROWS) {
                row.add(Field(x, y))
            }
            (currentFields as MutableList<List<Field>>).add(row)
        }
    }
}
