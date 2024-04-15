import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ConsoleInteractionTest {
    @Test
    fun initial_and_print() {
        val module = Module()
        Assertions.assertNotNull(module)

        val printed = module.print()
        Assertions.assertEquals("Shape: (C)ircle or (R)ectangle?",printed)
    }
}