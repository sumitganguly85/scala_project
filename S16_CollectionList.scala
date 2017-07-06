package com.cloudera.student

object S16_CollectionList extends App {

  val nums: List[Int] = List(1,2,3,4)
  val emptyList = Nil
  
  
  
  println("Head of nums : " + nums.head)
  println("Tail of nums : " + nums.tail)
  println("Tail of num 2 : " + nums.tail.head)
  
  println("Is nums Empty : " + nums.isEmpty)
  println("is emptyList Empty : " + emptyList.isEmpty)
  
  println("~~~~~~~~~~~~~~~~~~")
  println("List Concatenation")
  println("~~~~~~~~~~~~~~~~~~")
  
  val mynewList1 = List(3,6):::nums
  println(mynewList1)
  
  println(List(5,6)::nums)
  
  println(nums::List(5,6))
  
  println(List(5,6)::nums::nums)
  
  println(nums:::List(5,6))
  
  def sum3(myli :List[Int]):Int ={
    if(myli == Nil)
      {
        0
      }
    else
      {
      //println("myli cond " + myli)
      //println("myli.head " + myli.head)
      //println("myli.tail " + myli.tail)
      myli.head + sum3(myli.tail)
      }
      
    }
  
  println("The Sum Of MyList is : " + sum3(nums))
  
  val a = "Abcd"
  println(a.charAt(0))
  println(a.charAt(a.length-1))
  
  println(for(i<- 1 to 3; j<-1 to 3; k <-1 to 5) print((100*k + 10*i + j)))
  
}
