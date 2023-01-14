import org.testng.Assert.assertEquals
import org.testng.annotations.Test

/**
 * @author Ruslan Gadzhiev on 14.01.23
 * Test Driven Development
 */
class NumbersTest {

    @Test
    fun test_sum() {

        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.sum()
        val expected = 16
        assertEquals(expected, actual)
    }
    @Test
    fun test_difference(){
        val numbers:Numbers = Numbers.Base(12,4)
        val actual = numbers.dif()
        val expected = 8
        assertEquals(expected,actual)

    }

    @Test
    fun test_divide(){
        val numbers:Numbers = Numbers.Base(12,4)
        val actual = numbers.div()
        val expected = 3
        assertEquals(expected,actual)
    }
}