import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class NumbersTest {

    @Test
    fun test_sum() {

        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.sum()
        val expected = 16
        assertEquals(expected, actual)
    }
}