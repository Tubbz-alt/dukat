// [test] _referenced.kt
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import MyFramework.MyEvent

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface MyFramework {
    fun mark()
    fun triggerHandler(eventType_event: String): Any
    fun triggerHandler(eventType_event: MyEvent): Any
    interface MyEvent {
        fun ping()
    }
    open class MyClass

    companion object {
        var prop: String
    }
}