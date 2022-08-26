import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class NeighbourCounterTest {

    @Test
    internal fun `test dead neighbourhood`() {
        val neighbourhood = Neighbourhood("""
            000
            0x0
            000
        """.trimIndent())
        countNeighbours(neighbourhood) shouldBe 0
    }

    @Test
    internal fun `test count one in neighbourhood`() {
        val neighbourhood = Neighbourhood("""
            000
            0x1
            000
        """.trimIndent())
        countNeighbours(neighbourhood) shouldBe 1
    }
}