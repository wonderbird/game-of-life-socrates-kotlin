import CellState.DEAD
import CellState.ALIVE
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class RulesTest {

    @Nested
    inner class Rules {
        @Test
        internal fun `cell without neighbours dies`() {
            nextFromNeighbourCount(ALIVE, 0) shouldBe DEAD
        }

        @Test
        internal fun `cell with one living neighbour dies`() {
            nextFromNeighbourCount(ALIVE, 1) shouldBe DEAD
        }

        @Test
        internal fun `cell with two living neighbours survives`() {
            nextFromNeighbourCount(ALIVE, 2) shouldBe ALIVE
        }

        @Test
        internal fun `cell with two three neighbours survives`() {
            nextFromNeighbourCount(ALIVE, 3) shouldBe ALIVE
        }

        @Test
        internal fun `cell with more than three neighbours dies`() {
            nextFromNeighbourCount(ALIVE, 4) shouldBe DEAD
        }

        @Test
        internal fun `dead cell with two neighbours stays dead`() {
            nextFromNeighbourCount(DEAD, 2) shouldBe DEAD
        }

        @Test
        internal fun `dead cell with three neighbours should become alive`() {
            nextFromNeighbourCount(DEAD, 3) shouldBe ALIVE
        }

        @Test
        internal fun `dead cell with four neighbours stays dead`() {
            nextFromNeighbourCount(DEAD, 4) shouldBe DEAD
        }
    }
}

