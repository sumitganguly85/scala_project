package com.cloudera.student

object S14_Maps extends App {

  //Immutable Map -- Not Possible to add new key/value pair in it
  val mapping1 = Map("Sumit" -> "Ganguly", "Amit" -> "Ganguly", "Sumit" -> "Ghosh")
  
  println(mapping1)
  
  //Mutable Map -- Possible to add new key/value pair in it
  val mapping2 = scala.collection.mutable.Map("Kaushik" -> "Roy", "Tanmoy" -> "Adhikary")
  var mapping4 = scala.collection.mutable.Map("Kaushik" -> "K", "Amitava" -> "K")
  
  println(mapping4)
  mapping4 = mapping2
  
  mapping2+=("Subir" -> "Mondal","Arghya" -> "Mondal")
  
  
  println("The keys for Mapping2 " + mapping2.keys)
  println("The values for Mapping2 " + mapping2.values)
  
  println("Getting a value of Kaushik from Mapping2 " + mapping2.getOrElse("Kaushik1", 0))
  println("Getting a value of Kau from Mapping2 " + mapping2.getOrElse("Kau", "Not Found"))
  
  val mapping3 = for((k,v)<-mapping2) yield (v,k)
  
  println("Mapping2 " + mapping2)
  println(mapping3)
  println("The keys of Mapping3 " + mapping3.keys)
  println(mapping3)
  
  
  
  
}
