package com.design.patterns.singleton

class Execution {

    fun getInstance(): Setting {
        if (instance == null) {
            instance = Setting()
        }

        return instance as Setting
    }

    companion object {
        var instance: Setting? = null
    }
}
