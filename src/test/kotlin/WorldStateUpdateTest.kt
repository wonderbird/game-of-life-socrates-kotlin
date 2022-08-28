import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class WorldStateUpdateTest {
    @Test
    fun `empty world should stay empty`() {
         WorldState(emptyMap()).nextWorldState() shouldBe WorldState(emptyMap())
    }

}