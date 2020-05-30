object Q2 extends App{
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

   def primeSeq(n:Int):Unit ={
     if(n>0) primeSeq(n-1)
     if(prime(n-1)) println(n-1)

  }
   primeSeq(11)


}
