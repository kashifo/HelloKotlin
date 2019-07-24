package syntax

fun main(){

    welcome("Kashif")

    val a = add(5, 10)
    println(a)

    val b = 2
    multiply(a, b)

    mul(2, 2)
    mul(2) //default / optional parameter
    mul( b=2, a=4 ) //named paramter calling

    welcomeUser("Kashif")
    welcomeUser() //optional parameter

    userInfo(name="Kashif", phone="1234567890") //when skipping default param, mention param names.

    addAll(1,2,3,4,5,6,7,8,9,10)

}

fun welcome(name: String) = println( "Welcome, "+name )

fun add(a:Int, b:Int): Int = a+b

fun multiply(x: Int, y: Int){
    println( "$x x $y = ${x*y}" )
}

fun mul(a:Int, b:Int=0){
    println(a*b)
}

fun welcomeUser(name: String = "there") = println("Hello, $name")

fun userInfo(name: String, address: String = "N/A", phone: String = "N/A"){
    println( "Name = $name, Address = $address, phone = $phone" )
}

fun addAll(vararg nos: Int){

    var n = 0

    for( i in nos )
        n+=i

    print("addAll=$n")
}