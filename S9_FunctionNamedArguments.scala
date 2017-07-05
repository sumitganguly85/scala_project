package com.cloudera.student

object S9_FunctionNamedArguments {

  def main(args: Array[String]){
    
    println("The sum of values intReturn " + intReturn(a=10,d=10))
    println("The sum of values intReturn " + intReturn(5,d=10,c=30,b=90))
    println("The sum of values intReturn " + intReturn(d=10,a=10))
    println("The sum of values intReturn " + intReturn(a=10,d=10,b=100))
  }
  
  def intReturn(a: Int=0, b: Int=0, c: Int=0, d: Int=0) : Int ={
    
    var sum: Int =0
    sum = a+b+c+d  
    return sum    
  }
  
}
