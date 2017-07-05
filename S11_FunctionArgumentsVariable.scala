package com.cloudera.student

object S11_FunctionArgumentsVariable {

  def main(args: Array[String]){
    printStrings("Welcome","To","Spark","Programming")
    println("======================")
    printStrings("Welcome","To","Spark")
  }
  
  def printStrings(args: String*) ={
    var count: Int =0
    for(arg <- args)
    {
      println("Arg Value[" + count + "] = " + arg);
      count = count+1
    }
  }
}
