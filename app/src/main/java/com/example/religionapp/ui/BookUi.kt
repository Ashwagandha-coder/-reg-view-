package com.example.religionapp.ui

import com.example.religionapp.ui.mappers.Abstract

sealed class BookUi(): Abstract.Object<Unit, Abstract.Mapper.Empty>() {

    // todo: interface Communication for data for UI

    class Base() : BookUi() {
        override fun map(mapper: Abstract.Mapper.Empty) {
            TODO("Not yet implemented")
        }
    }
}