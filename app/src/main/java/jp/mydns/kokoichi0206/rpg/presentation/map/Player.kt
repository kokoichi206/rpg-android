package jp.mydns.kokoichi0206.rpg.presentation.map

/**
 * プレイヤーの情報。
 */
class Player(
    var coordinateX: Int = 15,
    var coordinateY: Int = 17,
    var drawableState: PlayerDrawableState = PlayerDrawableState(PlayerDrawableState.Direction.SOUTH)
) {
    fun update(): Player {
        return Player(
            coordinateX = coordinateX,
            coordinateY = coordinateY,
            drawableState = PlayerDrawableState(
                direction = drawableState.direction,
                state = drawableState.state + 1
            )
        )
    }
}
