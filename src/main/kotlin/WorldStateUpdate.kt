fun WorldState.nextWorldState(): WorldState {
    return this
}


data class WorldState(
    val cells: Map<Coordinate, CellState>
)

data class Coordinate(
    val x: Int,
    val y: Int
)

