package com.cloudera.student

object S15_Tuples extends App {

  val intList = List(2,7,9,6,5,8,2,4,6,2,9,8,1,0)
  
  val simpletuple = (2,3,"name","anotherstring")
  val simpletuple1 =(List(2,4,6,8), List(1,3,5,7,9), List(5,10,15), "AnotherElement")
  
  println(simpletuple._4)
  println(simpletuple1._3)
  
  val quicktry3 = intList.partition { x => x>2}
  val quicktry4 = intList.partition(_ >2)
  println(quicktry3)
  println(quicktry4)
  
  val(big,small)= intList.partition(_ >5)
  println("Big Numbers " + big)
  println("Small Numbers " + small)
  
  val stringCapital = "New Delhi India"
  val(uppercase,lowercase) = stringCapital.partition(_.isUpper)
  println(uppercase)
  println(lowercase)
  
  
}
