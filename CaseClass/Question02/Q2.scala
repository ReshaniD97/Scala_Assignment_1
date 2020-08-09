object Q2 extends App {
  val p1 =Point1(2,3)
  val p2 =Point1(5,4)

  println("\nPoint p1 : "+p1)
  println("Point p1 : "+p2)

  println("\nMove Point p1 : "+p1.move(3,2))
  println("Move Point p2 : "+p2.move(3,2))



}
case class Point1(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  def move(dx:Int,dy:Int)=Point1(this.x+dx,this.y+dy)
}

