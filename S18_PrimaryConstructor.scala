/*
class PrimeDuck
{
  var size =0
  var age=0;
  println(size,age)
  println("Test Output 1")  
  this.size=5
  this.age=10
  println("Test Output 2")
}
*/

class PrimeDuck(val size: Int, val age: Int)
{
  //var size =0
  //var age=0;
  println(size,age)
  println("Test Output 1")  
  //this.size=5
  //this.age=10
  println("Test Output 2")
}

object DemoDuck1 extends App
{
  println("Calling default Constructor")
  var d1 = new PrimeDuck(10,20)
  println("Again")
  var d2 = new PrimeDuck(30,40)
  println("Of d1 Object Value : " + d1.size,d1.age)
  println("Of d2 Object Value : " + d2.size,d2.age)
}
