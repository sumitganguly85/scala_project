package com.cloudera.student

object S8_FunctionDefaultParams {

  def main(args: Array[String]){   
    println("Default Value : " + addValues())
    println("Default Value : " + addValues(6))
    println("Default Value : " + addValues(6,3))
    println("Default Value : " + addValues(b=3))
  }
  
  def addValues(a: Int=4, b: Int=2) : Int = {
    
    var sum: Int =0;
    sum = a+b    
    return sum
  } 
  
}
