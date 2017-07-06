package com.cloudera.student
import scala.collection.mutable.ArrayBuffer

object S13_ArrayBuffer extends App {
  val a = ArrayBuffer[Int]()
  a+=1
  
  for(i<-a)
  {
    println(i)
  }
  
  println("Adding (2,3,4)")
  a+=(2,3,4)
  
   for(i<-a)
  {
    println(i)
  }
  
  println("Adding (6,7,8)")
  a+= (6,7,8)
  
  
  println("~~~~~~~~~~~~~~~~~~~~~~~~~~")
  println("~~~~~ Transformation ~~~~~")
  println("~~~~~~~~~~~~~~~~~~~~~~~~~~")
  
  val yieldvalue = for(i<-a if i%2==0) yield (i*2)
  println(yieldvalue)
  println("YieldValue " + yieldvalue.mkString("**"))
  //mkString without padding any Character
  println("YieldValue " + yieldvalue.mkString)
  
  //sorting the elements inside collection
  val mySortTest = Array(1,7,2,9)
  println("Actual elements " + mySortTest.mkString("**"))
  scala.util.Sorting.quickSort(mySortTest)
  println("Elements after Sorting " + mySortTest.mkString("**"))
  
  
  
}
