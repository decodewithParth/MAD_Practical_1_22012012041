open class Person(var mobileNo:Long){
    var address:String=""
    constructor(mNo:Long,add:String) : this(mNo) {
        address=add;
        mobileNo=mNo;
    }
}

class Student(var erno:Long,var name:String):Person(6353332437){
    constructor(erno: Long):this(erno,"Parth"){
        var erno=this.erno;
        var name=this.name;
    }
    fun printInfo(){
        println("Student name is ${name}");
        println("Student Enrollment No. is ${erno}");
    }
}

fun main(){
    var s1=Student(22012012041,"Parth");
    s1.printInfo()
    println("Student mobile no : ${s1.mobileNo}");
}