package com.example.unittestingapp

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


/**
 * Created by relkharboutly on 4/3/2018.
 */
class CalculatorTest {
    private var mCalculator: Calculator? = null
    @Before
    @Throws(Exception::class)
    fun setUp() {
        mCalculator = Calculator()
    }

    @Test
    @Throws(Exception::class)
    fun sum() {
        assertEquals(6.0, mCalculator!!.sum(5.0, 1.0), 0.0)
    }

    @Test
    @Throws(Exception::class)
    fun subtract() {
        assertEquals(1.0, mCalculator!!.subtract(5.0, 4.0), 0.0)
    }

    @Test
    @Throws(Exception::class)
    fun divide() {
        assertEquals(5.0, mCalculator!!.divide(20.0, 4.0), 0.0)
    }

    @Test
    @Throws(Exception::class)
    fun multiply() {
        assertEquals(20.0, mCalculator!!.multiply(5.0, 4.0), 0.0)
    }
}