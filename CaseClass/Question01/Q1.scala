object Q1 extends  App {
  val p1 =Point(2,3)
  val p2 =Point(5,4)
  val p3=p1+p2

  println("\nPoint p1 : "+p1)
  println("Point p1 : "+p2)

  println("\nAddition of Point p1 and p2 : "+p3)

}
case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
}
