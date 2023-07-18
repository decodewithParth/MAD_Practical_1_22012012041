fun fact(num:Int):Int{
    if(num==1){
        return num;
    }
    else return num*fact(num-1);
}

fun main(){
    print("Enter number : ")
    var num= readln()!!.toInt();
    var ans=fact(num);
    println("Factorial of ${num} = ${ans}")
}