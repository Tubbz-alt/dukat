package org.jetbrains.dukat.compiler.tests.extended

import org.jetbrains.dukat.compiler.tests.CliTranslator
import org.jetbrains.dukat.compiler.tests.CompileMessageCollector
import org.jetbrains.kotlin.cli.common.ExitCode
import org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments
import org.jetbrains.kotlin.cli.js.K2JSCompiler
import org.jetbrains.kotlin.config.Services
import java.io.File
import kotlin.test.assertEquals

abstract class CompilationTests {

    private fun getTranslator(): CliTranslator = CliTranslator("../node-package/build/env.json", "../node-package/build/distrib/bin/dukat-cli.js")

    abstract fun runTests(
            descriptor: String,
            sourcePath: String
    )

    protected fun compile(sourcePath: String, targetPath: String): ExitCode {

        val options =
                K2JSCompilerArguments().apply {
                    outputFile = targetPath
                    metaInfo = false
                    sourceMap = false
                    noStdlib = true
                    libraries = listOf(
                            "./build/kotlinHome/kotlin-stdlib-js.jar"
                    ).joinToString(File.pathSeparator)
                }

        options.freeArgs = listOf(sourcePath)

        return K2JSCompiler().exec(
                CompileMessageCollector(),
                Services.EMPTY,
                options
        )
    }


    protected fun assertContentCompiles(
            descriptor: String,
            sourcePath: String
    ) {

        val targetPath = "./build/tests/compiled/${descriptor}"
        getTranslator().translate(sourcePath, targetPath)
        val targetSource = File(targetPath, "index.kt")
        val outSource = "${targetPath}/${descriptor}.js"

        assert(targetSource.exists()) { "$targetSource no found " }

        assertEquals(
                ExitCode.OK,
                compile(
                        targetSource.absolutePath,
                        outSource
                )
        )
    }

}


fun main() {

}