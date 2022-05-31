package jp.mydns.kokoichi0206.rpg.presentation.map

import jp.mydns.kokoichi0206.rpg.R
import jp.mydns.kokoichi0206.rpg.presentation.utils.Config

/**
 * マップの１ブロック分のクラス。
 */
class Field(
    coordinateX: Int,
    coordinateY: Int,
) {
    val drawableId: Int
    private val mapConvert = mapOf(
        0 to R.drawable.map_0,
        1 to R.drawable.map_1,
        2 to R.drawable.map_2,
        3 to R.drawable.map_3,
        4 to R.drawable.map_4,
        5 to R.drawable.map_5,
        6 to R.drawable.map_6,
        7 to R.drawable.map_7,
        8 to R.drawable.map_8,
        9 to R.drawable.map_9,
        10 to R.drawable.map_10,
        11 to R.drawable.map_11,
        12 to R.drawable.map_12,
        13 to R.drawable.map_13,
        14 to R.drawable.map_14,
        15 to R.drawable.map_15,
    )
    // 取得に失敗した場合のデフォルトのマップ。
    private val defaultMap = R.drawable.map_3

    private val maxColumnNum = Config.map2d.size
    private val maxRowNum = Config.map2d[0].size

    init {
        // トーラス的に座標を繋げて、二次元平面で１周させる。
        val mapId = Config.map2d[coordinateY % maxColumnNum][coordinateX % maxRowNum]
        drawableId = mapConvert[mapId] ?: defaultMap
    }
}
