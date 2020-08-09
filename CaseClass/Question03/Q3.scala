object Q3 extends App {
  val p1 =Point2(2,3)
  val p2 =Point2(5,4)

  println("\n Distance between point p1 and p2 : "+p1.distance(p2))


}
case class Point2(a:Int,b:Int){
  def x=a
  def y=b

  def distance(that:Point2)=math.sqrt(math.pow(this.x-that.x,2)+math.pow(this.y-that.y,2))


}
