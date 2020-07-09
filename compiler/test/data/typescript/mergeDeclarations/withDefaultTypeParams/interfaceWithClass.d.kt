// [test] interfaceWithClass.kt
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

external interface SomethingElse<B> {
    fun bing(): Component__2<B, Number>
}

external open class Component<A, B, C> : SomethingElse<B> {
    override fun bing(): Component__2<B, Number>
    open fun pong()
    open fun ping()
}

external open class Component__2<A, B> : Component<A, B, Any>

external open class Component__1<A> : Component<A, Any, Any>

external fun <A, B, C> getComponent(): Component__1<A>