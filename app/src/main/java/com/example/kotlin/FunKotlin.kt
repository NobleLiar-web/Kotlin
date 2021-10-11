package com.example.kotlin
import kotlin.math.sqrt
fun main(){
    solveEquation(a = 1, b = 4, c = 3)

}
fun solveEquation(a:Int,b:Int,c:Int){
//    a * x^2 + b * x + c = 0
    val d=b*b-4*a*c//дискриминант
    if (d>0)
    {
        val x1= (-b+ sqrt(d.toDouble()))/2*a//корни
        val x2= (-b- sqrt(d.toDouble()))/2*a//корни
        val solutionSum= x1+x2//сумма
        println("Сумма корней = "
                +solutionSum)
    }
    else{
        println("Нет корней")
    }

}