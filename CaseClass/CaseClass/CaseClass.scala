object CaseClasses extends App{
  val p1 =Point(2,3)
  val p2 =Point(5,4)
  val p3=p1+p2

  println("\nPoint p1 : "+p1)
  println("Point p1 : "+p2)

  println("\nAddition of Point p1 and p2 : "+p3)

  println("\nMove Point p1 : "+p1.move(3,2))
  println("Move Point p2 : "+p2.move(3,2))

  println("\n Distance between point p1 and p2 : "+p1.distance(p2))

  println("\nInvert of point p1 : "+p1.invert())
  println("Invert of point p2 : "+p2.invert())
}
case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  def distance(that:Point)=math.sqrt(math.pow(this.x-that.x,2)+math.pow(this.y-that.y,2))
  def invert()=Point(this.y,this.x)

}
