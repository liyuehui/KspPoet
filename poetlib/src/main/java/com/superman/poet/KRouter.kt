package com.superman.poet

import kotlin.reflect.KClass

object KRouter {

    fun <T : Any> getInstanceBy(clazz: KClass<T>): InstanceFactory<T>? {
        val name = clazz.qualifiedName + "Builder"
        try {
            return Class.forName(name).newInstance() as? InstanceFactory<T>
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }
}