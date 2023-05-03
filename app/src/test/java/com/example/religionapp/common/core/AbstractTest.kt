package com.example.religionapp.common.core

import org.junit.Test


internal class AbstractTest {

    @Test
    fun test_succsess() {




    }



    private class TestDataObject: Abstract.Object<TestDomainObject,TestDomainToDataMapper>() {

       abstract override fun map(mapper: TestDomainToDataMapper): TestDomainObject




    }

    private interface TestDomainToDataMapper: Abstract.Mapper

    private sealed class TestDomainObject





}