object Q2 extends App {
  var x:Rational1=new Rational1(3,4)
  var y:Rational1=new Rational1(5,8)
  var z:Rational1=new Rational1(2,7)
  var answer:Rational1=x-y-z

  println("X ="+x)
  println("Y ="+y)
  println("Z ="+z)
  println("X-Y-Z ="+answer)
}

 class Rational1(n:Int,d:Int){

  def numer=n/gcd(math.abs(n),d)
  def denom=d/gcd(math.abs(n),d)
  def this(n:Int)=this(n,1)

  private def gcd(a: Int, b: Int):Int=if (b==0)a else gcd(b,a%b)
  def neg=new Rational1(-this.numer,this.denom)
  def +(r:Rational1):Rational1=new Rational1(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom)
   def -(r:Rational1)=this+r.neg
   override def toString: String = numer+"/"+denom


}
