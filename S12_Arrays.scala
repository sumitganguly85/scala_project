package com.cloudera.student
import Array._

object S12_Arrays extends App {
  
  var array1 = Array(1.9,2.9,3.4,3.5)
  //Print all elements in Array
  println("=====================")
  println("Print the elements of an Array")
  println("=====================")
  for(x<-array1)
  {
    println(x)
  }
  
  println("=====================")
  println("Multidimentional Array")
  println("=====================")
  
  //Two Dimentional Array
  //Need to import Array Package
  
  var arrMultidimention = ofDim[Int](3,3)
  
  //Build the Multidimention Array
  for(i<-0 to 2)
  {
    for(j<-0 to 2)
    {
      arrMultidimention(i)(j) = j;
    }
  }
  
  //Print the Multidimention Array
  for(i<-0 to 2)
  {
    for(j<-0 to 2)
    {
      print(arrMultidimention(i)(j) + " ")
    }
    println()
  }
  
  //Concatenation of two Array
  
  println("=====================")
  println("Array Concatenation")
  println("=====================")
  
  val array1st = Array(1.2,1.3,3.2)
  val array2nd = Array(99.9,12.36,45,65)
  
  val finalArray = concat(array1st,array2nd)
  
  //print the element of final Array
  
  for(x<-finalArray)
  {
    println(x)
  }
  
  //Array Range
  println("=====================")
  println("Array Range with Step of 2")
  println("=====================")
  
  val firstRange = range(10,20,2)
  val secondRange = range(10,20)
  val thirdRange = range(1,500)

  for(x<-firstRange)
  {
    print(x + " ")
  }
  
  println()
  println("=====================")
  println("Array Range without Step")
  println("=====================")
  
   for(x<-secondRange)
  {
    print(x + " ")
  }
  
  println()
  println("=====================")
  println("Array Range from 1 to 500")
  println("=====================")
  
  for(x<-thirdRange)
  {
    print(x + " ")
  }
  
  println()
  println("=====================")
  println("Scala Quick Sort")
  println("=====================")
  
  //val arrayInt = Array(9,1,2,0,5)
  val arrayInt = Array("B","A","Z")
  scala.util.Sorting.quickSort(arrayInt)
  print(arrayInt.mkString("**"))
  
}
