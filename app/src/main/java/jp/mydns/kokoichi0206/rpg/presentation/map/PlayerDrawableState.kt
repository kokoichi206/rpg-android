package jp.mydns.kokoichi0206.rpg.presentation.map

import jp.mydns.kokoichi0206.rpg.R

/**
 * プレイヤーの描画に関する情報。
 */
class PlayerDrawableState(
    var direction: Direction,
    var state: Int = 0,
) {
    /**
     * プレイヤーの向いている方向。
     */
    enum class Direction {
        NORTH, SOUTH, WEST, EAST
    }

    private val northDrawable = arrayOf(
        R.drawable.player_6,
        R.drawable.player_7,
    )
    private val southDrawable = arrayOf(
        R.drawable.player_0,
        R.drawable.player_1,
    )
    private val westDrawable = arrayOf(
        R.drawable.player_4,
        R.drawable.player_5,
    )
    private val eastDrawable = arrayOf(
        R.drawable.player_2,
        R.drawable.player_3,
    )

    init {
        // 各向きに２枚の画像が用意されているからmod2で状態を用意する。
        state %= 2
    }

    /**
     * 描画すべきDrawableを取得する。
     */
    fun getDrawable(): Int {
        return when (direction) {
            Direction.NORTH -> northDrawable[state]
            Direction.SOUTH -> southDrawable[state]
            Direction.WEST -> westDrawable[state]
            Direction.EAST -> eastDrawable[state]
        }
    }
}