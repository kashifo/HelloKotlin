package warmup

fun main(){
    println("\n-----S T A I R C A S E-----")
    downStairs()
    println()
    upStairs()
}

fun downStairs():Unit{

    for (i in 1..10){

        for(j in 1..i){
            print("_")
        }

        println()
    }

}


fun upStairs(){

    for(i in 1..12){

        for(j in 1..(12-i) ){
            print(" ")
        }

        for (k in (12-i)..12 ){
            print("_")
        }

        println()

    }

}