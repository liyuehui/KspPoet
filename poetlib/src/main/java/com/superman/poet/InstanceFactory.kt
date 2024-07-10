package com.superman.poet

interface InstanceFactory<T> {

    fun get(): T?
}