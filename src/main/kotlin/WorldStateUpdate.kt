fun WorldState.nextWorldState(): WorldState {
    val newCells = this.cells
        .map {
            Cell(
                it.coordinates,
                nextFromNeighbourCount(it.cellState, 0)
            )
        }
        .filter { it.cellState != CellState.DEAD }
    return WorldState(newCells)
}


data class WorldState(
    val cells: List<Cell>
)

data class Cell(
    val coordinates: Coordinates,
    val cellState: CellState,
)

data class Coordinates(
    val x: Int,
    val y: Int
)

