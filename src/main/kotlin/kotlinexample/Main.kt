package kotlinexample

import groovy.lang.GroovyShell
import groovy.util.Eval
import java.io.StringReader
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import kotlin.system.measureTimeMillis

fun main() {
    val shell = GroovyShell()
    val result1 = shell.evaluate("3*5")
    val result2 = shell.evaluate(StringReader("3*5"))
    val script = shell.parse("3*5")
    measureTimeMillis{script.run()}.apply(::println)
    println(result1 == result2)
}
