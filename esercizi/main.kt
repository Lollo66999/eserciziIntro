package appunti.esercizi

fun main(){
    val ar= intArrayOf(7,12,8,2,10)
    val result= findSum(ar,9)
    println(result?.joinToString())
    // 0, 3
}

fun findSum(a: IntArray,sum: Int): IntArray?{
    val result= IntArray(2)
    for(i in 0 until a.size){
        for(j in i+1 until a.size){
            if(a[i]+a[j]==sum){
                result[0]= i
                result[1]= j
                return result
            }
        }
    }
    return null
}