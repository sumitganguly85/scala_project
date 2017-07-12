object SingletonReservations
{
  private var lastnum = 0;
  val someconst = 3.14
  def newResrvationNum() ={lastnum +=1; lastnum}
}

object DemoReservation extends App
{
  var r1 = SingletonReservations.newResrvationNum()
  var r2 = SingletonReservations.newResrvationNum()
  var r3 = SingletonReservations.newResrvationNum()
  var r4 = SingletonReservations.newResrvationNum()  
  var r5 = SingletonReservations.someconst
  
  println("r1: " + r1 + ",r2: " + r2 + ",r3: " + r3 + ",r4: " + r4 + ",r5: " + r5);
}
