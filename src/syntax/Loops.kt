package syntax

import mypack.a

fun main(){

    for(i in 1..10)
        print("$i ")

    println()

    for(i in 2..10 step 2)
        print("$i ")

    println()

    for(i in 1 until 10 step 3)
        print("$i ")

    println()

    for(i in 10 downTo 1)
        print("$i ")

    println()


    val nos = arrayOf(1,2,3)
    for(i in nos)
        print("$i ")

    println()

    nos.forEach { n -> print("$n, ") }


}