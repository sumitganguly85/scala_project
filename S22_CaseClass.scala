case class Person(firstName: String, lastName: String)

object caseDemo extends App
{
  val me = Person("Sumit","Ganguly")
  val first =me.firstName
  println(first)
  
  val last=me.lastName
  println(last)
  
  //me.firstName="ABC" // Can not change the value of FirstName is Immutable
  //Creation of anothe object
  
  val me1= Person("Ria","Ganguly")
  
  if(me == Person(first,last))
  {
    println("Found Myself")
    println(me)
    
  }
   
}
