package fundamentals

fun main(){
    println(isEven(3))
}

fun isEven(num: Int = 0): String{
    if (num % 2 == 0 ){
       return "par";
    }
    return "impar";
}