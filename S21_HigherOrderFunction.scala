//Any Function that is called as an arguments from another function is called as Higher Order Function
//A function that is going to return another function is also known as Higher order Function

object Main21 extends App
{
  def demo
  {
    println("Hello")
    /*
    println("Map : " + (1 to 9).map(x => x+1)) // Map is a Higher Order Function
    println("For Each : ") 
    (1 to 9).foreach((x: Int) => println(x)) //For Each is Higher Order Function
    println("Map with For Each : ")
    (1 to 9).map(x=>x+1).foreach((x: Int) => println(x)) // Map with Foreach       
    println("Other Way of Map with For Each : ")
    (1 to 9).map(x=>x+1).foreach(println) // Other way to represent map with Foreach
    println("Map with For each with Multiplication of 10")
    (1 to 9).map(x=>x*10).foreach(println) // Another example of map with Foreach
    println("Other way Map with For each with Multiplication of 10")
    (1 to 9).map(_ *10).foreach(println) // As arguments x is used once so we can representt it as _)
    println("_ at the last Map with For each with Multiplication of 10")
    (1 to 9).map(0.1 * _).foreach(println _) // We can put _ at the last also
    println("_ is Optional")
    (1 to 9).map(0.1 * _).foreach(println) // We can put _ at the last also
    */
    println("#"*2)
    println("#"*10)
    (1 to 9).map("#" * _).foreach(println _)
    
    // Another higher order function Filter
    println("Filter")
    (1 to 9).filter(x=>x %2==0).foreach((x: Int) => println(x)) 
    println("Another Condition")
    (1 to 9).filter(x=> x>2 && x<5).foreach((x:Int) => println(x))
    
    //ReduceLeft
    println("ReduceLeft " + (1 to 6).reduceLeft(_ + _))
    
  }

  demo
}

