import java.util.Arrays

fun printArray(arr: Array<Int>){
    arr.contentDeepToString();
    for (item in arr) {
        println(item)
    }
}

fun main() {
    var a1 = arrayOf(10, 90, 60, 80, 100);
    println("Created array-1 using arrayOf method: ")
    printArray(a1);

    var a2=Array<Int>(5){0};
    println("Created array-2 using Array<>() method: ")
    printArray(a2);

    var a3=Array<Int>(10){i:Int->i+1};
    println("Created array-3 using Array<>() and lambda function: ");
    printArray(a3);


}


