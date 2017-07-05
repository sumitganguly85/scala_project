package com.cloudera.student

object S10_FunctionRecursive {

  def main(args: Array[String])
  {
        
    for(x<-1 to 5)
    {
      println("Factorial value of "+ x +" will be " + factorial(x))  
    }   
    
  }
  
  def factorial(a: BigInt) : BigInt = {
    
    if (a<=1)    
      1    
    else    
      a * factorial(a-1)
  }
}
