object Q1 extends App {
  val x = new Rational(3,4)
  val y=new Rational(5,8);
  println(x.neg)
  println(y.neg)
}
class Rational(n:Int,d:Int){
  def numer=n/gcd(n,d)
  def denom=d/gcd(n,d)
  def this(n:Int)=this(n,1)

  private def gcd(a: Int, b: Int):Int=if (b==0)a else gcd(b,a%b)
  def neg=new Rational(-this.numer,this.denom)

  override def toString: String = numer+"/"+denom


}
