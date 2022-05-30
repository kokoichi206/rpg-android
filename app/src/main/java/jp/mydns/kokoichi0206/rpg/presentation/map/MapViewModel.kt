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
    var currentFields by mutableStateOf<List<List<Field>>>(
        mutableListOf()
    )

    private var playerX: Int = 15
    private var playerY: Int = 17

    init {
        updateFields()
    }

    private fun updateFields() {
        currentFields = mutableListOf()

        // TODO：Indexが範囲外に出る時の考慮
        // マップを移動できるようにした際に考慮する。
        for (y in (playerY - Config.MAP_NUM_COLUMNS / 2) until (playerY - Config.MAP_NUM_COLUMNS / 2 + Config.MAP_NUM_COLUMNS)) {
            val row = mutableListOf<Field>()
            for (x in (playerX - Config.MAP_NUM_ROWS / 2) until playerX - Config.MAP_NUM_ROWS / 2 + Config.MAP_NUM_ROWS) {
                row.add(Field(x, y))
            }
            (currentFields as MutableList<List<Field>>).add(row)
        }
    }
}
