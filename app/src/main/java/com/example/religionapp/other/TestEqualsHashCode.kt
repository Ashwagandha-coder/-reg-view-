package com.example.religionapp.other


class TestHashMap {

    private val hashMap = HashMap<OverrideHashCode, String>()


    fun make() {


        hashMap.put()
        hashMap.get()


    }


}


class TestEqualsHashCode {

    private var number: Int? = null
    private var name: String? = null
    private var age: Int? = null
    private val otherField: String? = null


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TestEqualsHashCode

        if (number != other.number) return false
        if (name != other.name) return false
        if (age != other.age) return false
        if (otherField != other.otherField) return false

        return true
    }

    override fun hashCode(): Int {
        var result = number ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (age ?: 0)
        result = 31 * result + (otherField?.hashCode() ?: 0)
        return result
    }


    fun make() {

        TestEqualsHashCode().equals(TestEqualsHashCode())

    }


}


class OverrideHashCode {

    private var number: Int? = null
    private var name: String? = null
    private var age: Int? = null
    private val otherField: String? = null


    override fun hashCode(): Int {
        var result = number ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (age ?: 0)
        result = 31 * result + (otherField?.hashCode() ?: 0)
        return result
    }


}


class OverrideEquals {

    private var number: Int? = null
    private var name: String? = null
    private var age: Int? = null
    private val otherField: String? = null


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as OverrideEquals

        if (number != other.number) return false
        if (name != other.name) return false
        if (age != other.age) return false
        if (otherField != other.otherField) return false

        return true
    }


}