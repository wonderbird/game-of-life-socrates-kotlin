import CellState.ALIVE
import CellState.DEAD

fun nextFromNeighbourCount(cellState: CellState, livingNeighbours: Int): CellState {
    return when (cellState) {
        DEAD -> when (livingNeighbours) {
            3 -> ALIVE
            else -> DEAD
        }

        ALIVE -> when (livingNeighbours) {
            2 -> ALIVE
            3 -> ALIVE
            else -> DEAD
        }
    }
}


enum class CellState {
    ALIVE, DEAD
}