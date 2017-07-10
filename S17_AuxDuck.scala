class AuxDuck
{
  var size =0;
  var age = 0;
  println("Test")
 
  def this(size: Int)
  {
    this() //Calls the primary Constructor    
    println("after this one Argument Constructor")
    this.size=size    
  }
  
  println("Test Middle")
  
  def this(size: Int, age: Int)
  {
    this(size) //Calls previous auxiliary constructor
    println("after this in two Argument Constructor")
    this.age = age
  }  
  println("Test End")
}

object DemoDuck extends App
{
  println("Calling Default Constructor")
  println("~~~~~~~~~~~~~~~~~~~~~~~~~~~")
  var d1=new AuxDuck  
  println("Again")
  println("~~~~~~~~~~~~~~~~~~~~~~~~~~~")
  var dagain = new AuxDuck
  
  //Call Constructor with Single Parameter
  
  println("Calling one Argument Constructor")
  println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
  var d2=new AuxDuck(5)
  
  //Call COnstructor with two Parameters
  
  println("Calling two Arguments Constructor")
  println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
  var d3=new AuxDuck(5,10)
  
  // Print the value of member variables 
  println(d1.size + "," + d1.age) // OutPut will be 0,0 as I called default constructor
  println(d1.size,d1.age) // OutPut will be (0,0) in form of Array as I called default constructor
  println(d2.size) // Output would be 5 as I called one argument constructor with value of size 5 and age 10
  println(d2.size,d2.age) // Output will be (5,0) as I called one argument constructor with size 5
  println(d3.size,d3.age) // output will be (5,10) in form of Array as I called two arguments constructor  
  
}
