import CellState.DEAD
import CellState.LIVING
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class RulesTest {

    @Test
    internal fun `cell without neighbours dies`() {
        nextState(LIVING, 0) shouldBe DEAD
    }

    @Test
    internal fun `cell with one living neighbour dies`() {
        nextState(LIVING, 1) shouldBe DEAD
    }

    @Test
    internal fun `cell with two living neighbours survives`() {
        nextState(LIVING, 2) shouldBe LIVING
    }

    @Test
    internal fun `cell with two three neighbours survives`() {
        nextState(LIVING, 3) shouldBe LIVING
    }

    @Test
    internal fun `cell with more than three neighbours dies`() {
        nextState(LIVING, 4) shouldBe DEAD
    }

    private fun nextState(state: CellState, livingNeighbours: Int) = when {
        livingNeighbours == 2 -> LIVING
        livingNeighbours == 3 -> LIVING
        else -> DEAD
    }
}

enum class CellState {
    LIVING, DEAD
}
