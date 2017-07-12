//Any Function that is called as an arguments from another function is called as Higher Order Function
//A function that is going to return another function is also known as Higher order Function

object Main21 extends App
{
  def demo
  {
    println("Hello")
    // Example & Usuage of Map
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
    
    //sortWith
    val x= "Mary had a little lambb".split(" ").sortWith(_.length < _.length)
    for(i <- x) println(i)
    
    //Another example with reduceLeft with another higher order function
    println("###################################")
    val findmax = (x: Int, y: Int) =>
    {
      val winner = x max y
      println("Compared %d to %d, %d was larger".format(x,y,winner))
      winner
    }
    
    val a = Array(20,12,6,35,2,90,23)
    println("Max Is : " + a.reduceLeft(findmax))
    
    //Another example of sortWith
    println("##############################")
    val ls = List(4,2,3,1)
    val ds = ls.sortWith(_ > _)
    ds.foreach(println)
    
    println("#############################")
    val xs = Seq(1,5,3,4,6,2)
    //val xsresult = xs.sortWith((left,right) => left>right)
    val xsresult = xs.sortWith(_>_) // As left & Right have been used only once so we can replace it as underscore(_)
    xsresult.foreach(println)
    
    //More Higher Order FUnction
    println("###########################")
    val set = (0 to 20).toSet
    def isEven(i: Int) = i%2==0
    val finalset=set.filter(isEven) 
    println(set.filter(i=>isEven(i)))
    println(set.filter(isEven(_)))
    println(set.filter(isEven))
    
    //Another implementation of Map
    println("###########################")
    def capitalizefn(s:String) = s.head.toUpper + s.tail.toLowerCase()
    val myListOfVal = List("ganGuly","AMIT","SumiT","kamal")
    val resultList = myListOfVal.map(capitalizefn)
    println(resultList)
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    resultList.map(println)
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    resultList.foreach(println)
    
    // partition - another Higher Order Function - Is to Use two sets including positive and Negative Condition Both
    
    println("###########################")
    val lsta = List(5,2,6,10,8,6,24)
    def even(i: Int) = i%2==0
    println(lsta.partition(even))
    println(lsta.partition(even)._1) // To get the First list of Elements
    println(lsta.partition(even)._2) // To get Second list of Elements
    
    // Another example of implementing higher order function
    // Condition of Higher Order Function 
    //1. A Function can be a Argument of another function
    //2. A Function can be a return type of another function
    //3. A function's output can be stored into a variable
    
    println("###########################")
    def mulby(factor: Double) = {(x: Double) => factor * x}
    val tripple = mulby(3)
    val half = mulby(0.5)
    val double = mulby(2)
    val fourtimes = mulby(4)
    
    val x1: Int =10;
    println("Tripple Of %d = ".format(x1) + tripple(x1))
    println("Half Of %d = " .format(x1) + half(x1))
    println("Double of %d = ".format(x1) + double(x1))
    println("Fourtimes of %d : ".format(x1) + fourtimes(x1))
    println(mulby(4)(2))
     
    
    
  }

  demo
}
