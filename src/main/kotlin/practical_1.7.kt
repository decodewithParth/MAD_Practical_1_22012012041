fun fact(num:Int):Int{
    if(num==1){
        return num;
    }
    else return num*fact(num-1);
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1){
        run.toLong()
    } else {
        factorial(n-1, run*n)
    }
}
fun main(){
    print("Enter number : ")
    var num= readln()!!.toInt();
    var ans=fact(num);
    var tail=factorial(5);
    println("Factorial of ${num} = ${ans}")
    println("By tailrec keyword ,Factorial of ${num} = ${ans}")

}