object Main20 extends App
{
  def sum(fa: Int=> Int, a: Int, b: Int): Int =
  {
    println(fa)
    if(a>b) 0
    else fa(a) + sum(fa, a+1, b)
  }
  
  def sumofint(x: Int): Int=x
  def cube(x: Int): Int=x * x *x
  def square(x: Int): Int=x * x
  def fact(x: Int): Int= if(x==0) 1 else x * fact(x-1)
  def mycustoms(x: Int): Int =4
  
  /*
  println("Sum : " + sum(sumofint,1,3))
  println("Cube : " + sum(cube,1,3))
  println("Square : " + sum(square,1,3))
  println("Fact : " + sum(fact,1,3))
  println("MyCustoms : " + sum(mycustoms,1,3))
  */
  //Anonymous Function
  //println("Annonymus : " + sum(x=>(x*x)+2,1,3))
  
  //Another way for Anonymous Function
  println("Annonymus : " + sum((x: Int)=>x*x,1,3))
  
  
}
