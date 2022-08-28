fun WorldState.next(): WorldState {
    return this
}


typealias WorldState = Map<Coordinate, CellState>
typealias Coordinate = Pair<Int, Int>

