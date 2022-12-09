import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FooTest {

    private val bar: Bar = mockk {
        every { id } returns "ID"
        every { duration } returns null
    }

    @Test
    fun `this test doesn't works`() {
        assertEquals("Execution of bar with id ID took an unknown time", Foo(bar).run())
    }
}