object Q3 extends App {
  def sumInputNum(a: Int): Int = {
    if (a ==1) 1
    else {
      a+ sumInputNum(a - 1)
    }

  }
  println(sumInputNum(5))
  println(sumInputNum(10))


}
