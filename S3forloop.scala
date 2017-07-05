package com.cloudera.student

object S3forloop {
  def main(args: Array[String])
  {
    var a=0
    val another = 123
    
    for(a <- 5 to 1 by -1)
    //for(a <- 5 to 1 by -2)
    //for(a <- 1 to 5 by 2)
    for(a <- 1 to 5)
    {
      println("This is the value of a: " + a)
    }
    
    var array1 = Array(1.9,2.9,3.4,3.5)
    for(x <- array1)
    {
      println(x)
      println("another result " + x*x)
      
    }
    //For each loop
    array1.foreach(println)
    array1.foreach(element => 
                    {
                      println(element)
                      println("The square root of element is " + element*element)
                    }
                  
                  )
  }
}
