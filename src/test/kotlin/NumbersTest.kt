import org.testng.Assert.assertEquals
import org.testng.annotations.Test
import java.lang.IllegalArgumentException


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
    fun test_difference() {
        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.dif()
        val expected = 8
        assertEquals(expected, actual)

    }

    @Test
    fun test_divide() {
        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.div()
        val expected = 3.0
        assertEquals(expected, actual, 0.01)
    }

//    @Test
//    fun test_divide_double() {
//        val numbers: Numbers = Numbers.Base(10, 4)
//        val actual = numbers.div()
//        val expected = 2.5
//        assertEquals(expected, actual, 0.01)
//    }

    @Test
    fun test_divide_zero() {
        val numbers: Numbers = Numbers.Base(10, 0)
        val actual = numbers.div()
        val expected = 1.0 / 0.0
        assertEquals(expected, actual)
    }




}