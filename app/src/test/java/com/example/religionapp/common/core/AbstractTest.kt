package com.example.religionapp.common.core


import org.junit.Test

import org.junit.Assert.*


internal class AbstractTest {

    @Test
    fun test_success() {
        val dataObject = TestDataObject.Success("one_text", "two_text")
        val mapper = TestDataToDomainMapper.Base()
        val domainObject = dataObject.map(mapper)

        assertTrue(domainObject is TestDomainObject.Success)


    }

    @Test
    fun test_failure() {

        assertEquals(3,2+2)

    }


    @Test
    fun more_test_cases() {


    }


    private sealed class TestDataObject :
        Abstract.Object<TestDomainObject, TestDataToDomainMapper>() {

        abstract override fun map(mapper: TestDataToDomainMapper): TestDomainObject


        class Success(private val textOne: String, private val textTwo: String) : TestDataObject() {
            override fun map(mapper: TestDataToDomainMapper): TestDomainObject =
                mapper.map(textOne, textTwo)

        }

        class Failure(private val exception: Exception) : TestDataObject() {
            override fun map(mapper: TestDataToDomainMapper): TestDomainObject =
                mapper.map(exception)
        }


    }

    private sealed class TestDomainObject : Abstract.Object<TestUiObject, TestDomainToUiMapper>() {

        abstract override fun map(mapper: TestDomainToUiMapper): TestUiObject

        class Success(private val textOne: String, textTwo: String) : TestDomainObject() {

            override fun map(mapper: TestDomainToUiMapper): TestUiObject = mapper.map()
        }

        class Failure(private val exception: Exception) : TestDomainObject() {

            override fun map(mapper: TestDomainToUiMapper) = mapper.map()
        }


    }

    private class TestUiObject()

    private interface TestDataToDomainMapper : Abstract.Mapper {

        fun map(textOne: String, textTwo: String): TestDomainObject

        fun map(e: Exception): TestDomainObject


        class Base() : TestDataToDomainMapper {
            override fun map(textOne: String, textTwo: String): TestDomainObject {
                return TestDomainObject.Success("one", "two")
            }

            override fun map(e: Exception): TestDomainObject {
                return TestDomainObject.Failure(e)
            }
        }


    }


    private interface TestDomainToUiMapper : Abstract.Mapper {

        fun map(): TestUiObject

        fun map(exception: Exception): TestUiObject


        class Base : TestDomainToUiMapper {


            override fun map(): TestUiObject = TestUiObject()

            override fun map(exception: Exception): TestUiObject = TestUiObject()
        }

    }


}