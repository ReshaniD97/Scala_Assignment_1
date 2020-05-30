object Q5 extends App {
  def isEven(n:Int):Boolean=n match {
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !isEven(n)
  def addEven(n:Int):Int=n match {
    case 0 => 0
    case x if (isEven(x)) => n-2+ addEven(x-2)
    case x if(isOdd(x)) => n-1+ addEven(x-1)
  }
  println(addEven(3))
  println(addEven(5))
  println(addEven(10))
  }














