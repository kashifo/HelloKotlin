package syntax

fun main(){

    println("---Variables---")

    val name = "Kashif"
    var age:Int = 0
    age = 24

    val b:Byte = 0
    val s:Short = 1
    val i:Int =  999999999
    val l:Long = 999999999999999999
    val f:Float = 3.14f
    val d:Double = 10.00

    val c:Char = 'a'
    val str:String = "Hello, World!"
    val bool:Boolean = true

    println("\n--------Type Conversion----------")

    val istr = "100"
    var num = istr.toInt()
    num += 1
    println(num)

    val num2 = Integer.valueOf(istr)

}