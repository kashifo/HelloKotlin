package warmup

import java.util.*

fun main(){

    println("Hi there! Enter your name")
    val name = readLine()

    println("Hello $name, Please enter you age")

    val scanr = Scanner(System.`in`)
    val age = scanr.nextInt()

    for( i in 1..age ) {

        if (name != null) {
            for( s in name ) {
                print(s)
                Thread.sleep(250)
            }
        }

        println()
        Thread.sleep(250)
    }

}