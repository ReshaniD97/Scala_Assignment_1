object Q1 extends App {

  def prime(p:Int, n:Int=2):Boolean=n match{
    case x if p==x => true
    case x if p<x => false
    case x if gcd(p,x)>1 => false
    case x => prime(p,x+1)
  }
  def gcd(x: Int, y: Int):Int=y match {
    case 0 => x
    case y if y>x =>gcd(y,x)
    case _ => gcd(y,x%y)
  }
  println(prime(11))
  println(prime(1))
  println(prime(8))

}
