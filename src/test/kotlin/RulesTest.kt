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
            nextState(ALIVE, 0) shouldBe DEAD
        }

        @Test
        internal fun `cell with one living neighbour dies`() {
            nextState(ALIVE, 1) shouldBe DEAD
        }

        @Test
        internal fun `cell with two living neighbours survives`() {
            nextState(ALIVE, 2) shouldBe ALIVE
        }

        @Test
        internal fun `cell with two three neighbours survives`() {
            nextState(ALIVE, 3) shouldBe ALIVE
        }

        @Test
        internal fun `cell with more than three neighbours dies`() {
            nextState(ALIVE, 4) shouldBe DEAD
        }

        @Test
        internal fun `dead cell with two neighbours stays dead`() {
            nextState(DEAD, 2) shouldBe DEAD
        }

        @Test
        internal fun `dead cell with three neighbours should become alive`() {
            nextState(DEAD, 3) shouldBe ALIVE
        }

        @Test
        internal fun `dead cell with four neighbours stays dead`() {
            nextState(DEAD, 4) shouldBe DEAD
        }
    }
}

