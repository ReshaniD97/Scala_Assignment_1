object Q4 extends App {
  val p1 =Point3(2,3)
  val p2 =Point3(5,4)

  println("\nPoint p1 : "+p1)
  println("Point p1 : "+p2)

  println("\nInvert of point p1 : "+p1.invert())
  println("Invert of point p2 : "+p2.invert())

}
case class Point3(a:Int,b:Int){
  def x=a
  def y=b

  def invert()=Point3(this.y,this.x)
}
