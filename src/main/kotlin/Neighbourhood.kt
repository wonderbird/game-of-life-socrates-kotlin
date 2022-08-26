class Neighbourhood(val stringRepresentation: String) {

}

fun countNeighbours(neighbourhood: Neighbourhood): Int {
    return neighbourhood.stringRepresentation
        .filter {it.isDigit() }
        .map { Integer.parseInt(it.toString()) }
        .sum()
}