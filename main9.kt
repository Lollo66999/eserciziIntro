package appunti

import java.util.*

fun main(arge: Array<String>){
    val myArray1: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    for (myElements: Int in myArray1) {
        println(myElements)
    }

    println(Arrays.toString(myArray1))

    val myMultiArray: Array<IntArray> = arrayOf(intArrayOf(1,2,3),
            intArrayOf(4,5,6),
            intArrayOf(7,8,9),
            intArrayOf(10))

    println(Arrays.deepToString(myMultiArray))
}