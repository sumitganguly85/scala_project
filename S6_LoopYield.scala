package com.cloudera.student

object S6_LoopYield {
  def main(args: Array[String])
  {
    var count=0;
    val mylist= List(1,2,3,4,5,6,7,8,9,10);
    //for loop execution with a yield
    var yeildval1 = for {count <- mylist
                       if count!=3; if count <8       
                        }yield count
    println("###############")
    println(yeildval1);
    
   // print the value under yeildval1 
    for(myval <- yeildval1)
    {
      println("This is value of myval " + myval);
    }
    
    //print until
    var sum =0;
    for(a<-0 until 11)
    {
      sum += a 
      print("\n" + sum + "\n")
    }
    print("Final " + sum)
    
    //Another example of yield
    val x=for(i<- 1 to 20) yield i*2.5
    for (z<-x) println(z)
  }
}
