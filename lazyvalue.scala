package com.cloudera.student

object lazyvalue extends App {
  
  val normalval = {
    println("---->>>  Initializing normal val  <<<----");
    "This is the normal val"
  }
  
  lazy val lazyval ={
    println("---->>> Initializing lazy val <<<----");
    "This is the lazy val"
  }
  
  println("\n\nno references have been made yet\n\n")
  println("Accessing normal val : ")
  println(normalval)
  println("Second time Accessing normal val : ")
  println(normalval)
  
  println("\n\nAccessing lazy val : ")
  println(lazyval);
  println("\n\nAccessing lazy val a second time, there should be no initialization now: ");
  println(lazyval);  
}
