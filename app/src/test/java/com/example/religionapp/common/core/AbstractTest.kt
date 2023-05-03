package com.example.religionapp.common.core

import android.widget.TextView
import org.junit.Test


internal class AbstractTest {

    @Test
    fun test_success() {




    }



    private sealed class TestDataObject: Abstract.Object<TestDomainObject,TestDomainToDataMapper>() {

       abstract override fun map(mapper: TestDomainToDataMapper): TestDomainObject


       class Success(private val textOne: TextView, private val textTwo: TextView):
           TestDataObject() {
           override fun map(mapper: TestDomainToDataMapper): TestDomainObject = mapper.map(textOne, textTwo)

       }

        class Failure(private val exception: Exception): TestDataObject() {
            override fun map(mapper: TestDomainToDataMapper): TestDomainObject  = mapper.map(exception)
        }




    }

    private interface TestDomainToDataMapper: Abstract.Mapper {

        fun map(textOne: TextView, textTwo: TextView): TestDomainObject

        fun map(e: Exception): TestDomainObject




    }

    private sealed class TestDomainObject





}