package syntax

/**
 * Created by Kashif on 7/27/2019.
 */
fun main(){

    val str = "Hello there"
    println(str)

    val story="""
         Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of its standard library depends on the Java Class Library, but type inference allows its syntax to be more concise.

        First appeared: 2011

        Filename extensions: .kt.kts

        Typing discipline: Inferred, static, strong
    """.trimIndent()

    println(story)



}