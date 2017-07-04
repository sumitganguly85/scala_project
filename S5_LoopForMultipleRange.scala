package com.cloudera.student

object S5_LoopForMultipleRange {
  def main(args: Array[String])
  {
    for(a <- 1 to 3; b <- 1 to 3)
    {
      println("This is the value of a " + a)
      println("This is the value of b " + b)
    }
    
    //multirange with condition
    for(a <- 1 to 3; b <- 1 to 3 if a==b)
    {
      println("This is value of a with condition: " + a + " :: " + b )
    }
  }
}
