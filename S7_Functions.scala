package com.cloudera.student

object S7_Functions extends App {

  
  
  def addInt(a: Int ,b: Int) :Int = {
    var mysum: Int = 0;
    mysum = a + b
    return mysum
  }
  
  println("Total Value : " + addInt(4,5))
  
  println("Calling of No Return Function" + addIntReturn(12,8))
  
  //This is called as procedure
  // No return type is mentioned
  def addIntReturn(a: Int, b: Int) {
    var mysum: Int =0;
    mysum = a+b
    println("Total value println inside procedure " + mysum)
  }
  
  
}
