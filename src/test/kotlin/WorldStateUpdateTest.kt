import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class WorldStateUpdateTest {
    @Test
    fun `empty world should stay empty`() {
        val worldState = emptyMap<Coordinate, CellState>()
        val nextWorldState = worldState.next()
        nextWorldState shouldBe emptyMap()
    }
}