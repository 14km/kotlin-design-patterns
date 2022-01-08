package com.design.patterns.singleton

class Execution {

    fun getInstance(): Setting {
        return instance?.let {
            instance
        }.run {
            Setting()
        }
    }

    companion object {
        var instance: Setting? = null
    }
}
