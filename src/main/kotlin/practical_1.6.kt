fun add(n1:Int,n2:Int,n3:Int){
    println("Addition of ${n1} , ${n2} ,${n3} is ${n1+n2+n3}");
}
fun div(n1:Int,n2:Int){
    println("Division of ${n1} , ${n2}  is ${n1/n2}");
}
fun sub(n1:Int,n2:Int,n3:Int){
    println("Subtraction of ${n1} , ${n2} ,${n3} is ${n1-n2-n3}");
}
fun mul(n1:Int,n2:Int,n3:Int){
    println("Multiplication of ${n1} , ${n2} ,${n3} is ${n1*n2*n3}");
}
fun main()
{
    add(111,2222,-222);
    sub(111,2222,-222);
    mul(111,2222,-222);
    div(2222,111);
    
}