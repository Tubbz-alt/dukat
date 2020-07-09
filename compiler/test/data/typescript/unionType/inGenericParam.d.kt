// [test] inGenericParam.My.Deeply.Nested.Response.kt
@file:JsQualifier("My.Deeply.Nested.Response")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package My.Deeply.Nested.Response

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

external interface Response : Box<dynamic /* String | Box<String> */> {
    var token: Box<String>
    var expirationToken: Box<String>
}

external interface Box<T>