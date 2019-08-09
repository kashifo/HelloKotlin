package syntax

import com.sun.xml.internal.fastinfoset.util.StringArray
import javax.swing.text.html.HTML.Attribute.N

fun main(){

    val nos = arrayOf(1,2,3)
    val n = nos[0]
    println( "nos=$nos len=${nos.size}" )
    println("nos[0]=${nos.get(0)} n=$n")
    nos[1]=1

    val names = arrayOf<String>("Kashif", "Anwaar","Steve","Jobs")
    for( element in names )
        print( element )

    val no = intArrayOf(3,6,9)
    println( no.size )

    var nums: Array<StringArray>

    val arr = IntArray(2)
    arr[0]=1
    arr[1]=2
    println( "arr.size="+ arr.size +", arr[0]="+arr.get(0) )

    val arrStr = StringArray(0, 5, false)
    arrStr.add("Bla Bla"); arrStr.add("Oh Oh"); arrStr.add("He He")
    println( "arrStr.size="+ arrStr.size +", arrStr[0]="+arrStr.get(0) )

}
