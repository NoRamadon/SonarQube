package dmi.example.unittestwithsonarqube

import org.junit.Test

import org.junit.Assert.*

class CalculatorUtilTest {

    private val calculatorUtil = CalculatorUtil()

    @Test
    fun `check sum result`() {
        val result = calculatorUtil.sum(2, 2)
        assertEquals(4, result)
    }

    @Test
    fun `check minus result`() {
        val result = calculatorUtil.minus(2, 2)
        assertEquals(0, result)
    }

    @Test
    fun `check multiply result`() {
        val result = calculatorUtil.multiply(5, 2)
        assertEquals(10, result)
    }
}