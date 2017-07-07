

/**
 * @author 444109
 */
class PrivateDuck {
  private var privateage = 0;
  
  def age= privateage //Getter Method
  
  //Setter Method
  def age_= (newAge: Int)
  {
    if(newAge>privateage)
    {
      privateage=newAge
    }  
  }
  
  private var value=0
  def incur() {value +=1}
  def current=value
  
}

object PrivateDuckDemo extends App{
  var f= new PrivateDuck
  f.age_=(19)
  println(f.age)
  
  f.incur()
  println(f.current)
}
