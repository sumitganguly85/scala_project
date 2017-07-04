package com.cloudera.student

object S2ifelse {
  def main(args: Array[String])
  {
    var x = 8;
    if (x < 10)
    {
      println("This is if statement");
    }
    else
    {
      println("This is else statement");
    }
    
    //as Scala is Functional programme, assign result from scala
    //if statement in a simple function
    def abs(x: Int) = {if (x >= 0) x else -x}
    
    println("calling abs function "+abs(4));
    println("calling abs function "+abs(-1))
    
    //running below code in interpreter will give more info.
    
    var xx = 5
    val s = if(xx > 0 && xx < 6) "positive" else 0
    val ss= if (xx > 0 && xx < 6) 1 else 0
    
  }
}
