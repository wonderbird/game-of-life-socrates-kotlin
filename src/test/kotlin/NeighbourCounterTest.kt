import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class NeighbourCounterTest {

    @Test
    internal fun `test dead neighbourhood`() {
        val neighbourhood = Neighbourhood("""
            ...f
            ...
            ...
        """.trimIndent())
        countNeighbours(neighbourhood) shouldBe 0
    }
}