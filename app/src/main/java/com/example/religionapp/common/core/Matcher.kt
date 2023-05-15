package com.example.religionapp.common.core

/**
 * Custom Matcher
 */


interface Matcher<S> {

    fun matches(args: S): Boolean

}