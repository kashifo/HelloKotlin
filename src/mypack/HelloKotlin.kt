package mypack

val name = "Kashif"
val a: Int = 5

fun main(){

    println("Hello Kotlin!")
    welcome(name)

    val b: Int
    b = 10
    println( sum(a, b) );

    sub("Kashif", 24)
    loop()

}

fun welcome(name: String){
    println( "Welcome "+name )
}

fun sum(a: Int, b: Int): Int{
    return a+b
}

//prints name and age
fun sub(name: String, age: Any){

    if(age !is Int){
        println("Invalid age")
        return
    }

    val months: Int
    months = age*12

    val days = months*30

    println( "Hello Mr."+name +", you are "+months +" months and " +days +" days old" )
}

fun loop(){

    for(i in 1..1000)
        println("Kashif is programmer!")

    val nos : IntArray
    nos = intArrayOf (5,9,5,66,1212,2,2)

    for(i in nos)
        println(i)

}