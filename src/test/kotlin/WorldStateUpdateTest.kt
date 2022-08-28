import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class WorldStateUpdateTest {
    @Test
    fun `empty world should stay empty`() {
         WorldState(emptyList())
             .nextWorldState() shouldBe WorldState(emptyList())
    }

    @Test
    fun `lone cell should die`() {
        WorldState(listOf(Cell(Coordinates(1, 2), CellState.ALIVE)))
            .nextWorldState() shouldBe WorldState(listOf())
    }
}