package com.example.religionapp.common.core

import org.junit.Test


internal class AbstractTest {

    @Test
    fun test_success() {
        val dataObject = TestDataObject.Success("one_text", "two_text")
        val exception = Exception("TestDataObject exception")
        val dataObject_2 = TestDataObject.Failure(exception)


    }


    private sealed class TestDataObject :
        Abstract.Object<TestDomainObject, TestDomainToDataMapper>() {

        abstract override fun map(mapper: TestDomainToDataMapper): TestDomainObject


        class Success(private val textOne: String, private val textTwo: String) : TestDataObject() {
            override fun map(mapper: TestDomainToDataMapper): TestDomainObject =
                mapper.map(textOne, textTwo)

        }

        class Failure(private val exception: Exception) : TestDataObject() {
            override fun map(mapper: TestDomainToDataMapper): TestDomainObject =
                mapper.map(exception)
        }


    }

    private sealed class TestDomainObject : Abstract.Object<TestUiObject, TestDomainToUiMapper>() {

        abstract override fun map(mapper: TestDomainToUiMapper): TestUiObject

        class Success(): TestDomainObject() {

            override fun map(mapper: TestDomainToUiMapper): TestUiObject = mapper.map()
        }

        class Failure(): TestDomainObject() {

            override fun map(mapper: TestDomainToUiMapper): TestUiObject = mapper.map()
        }


    }

    private sealed class TestUiObject

    private interface TestDomainToDataMapper : Abstract.Mapper {

        fun map(textOne: String, textTwo: String): TestDomainObject

        fun map(e: Exception): TestDomainObject


    }


    private interface TestDomainToUiMapper : Abstract.Mapper {

        fun map(): TestUiObject

    }


}