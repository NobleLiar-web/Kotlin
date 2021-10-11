package com.example.kotlin

fun main(){
    val firstname:String="yana"
    val lastname: String = "tagirova"
    var height:Int=166
    val weight=45f
    var isChild:Boolean=false
    println("${if (isChild) "yes" else "no"} ")
    var info= ("Имя:"+firstname+",Фамилия:"+lastname+
            ",Рост:"+height+",Вес:"+weight+",Ребенок ли:"+isChild)
    println(info)
    height=149
    isChild=true
    info= ("Имя:"+firstname+",Фамилия:"+lastname+
            ",Рост:"+height+",Вес:"+weight+",Ребенок ли:"+isChild)
    println(info)
}