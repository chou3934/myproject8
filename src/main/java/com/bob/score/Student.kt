package com.bob.com.bob.score

class Student (var name:String, var english:Int, var math:Int){
    init{
        println("Testing")
    }
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}")
    }
    fun getAverage()=(english+math)/2


}

fun main(){
    val jack=Student("Jack",90,50)
    println(jack.getAverage())
    jack.print()
}