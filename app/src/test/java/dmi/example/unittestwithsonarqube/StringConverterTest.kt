package dmi.example.unittestwithsonarqube

import org.junit.Test

import org.junit.Assert.*

class StringConverterTest {

    @Test
    fun greetingTest() {
        val converter = StringConverter()
        assertEquals("Hello John", converter.sayHello("John"))
    }
}