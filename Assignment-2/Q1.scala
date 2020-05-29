object Q1 extends App {
  def wage(h:Int)=h*150
  def ot(h:Int)=h*75
  def tax(x:Int)=x*0.1
  def income(h1:Int,h2:Int)=wage(h1)+ot(h2)
  def takeHome(h1:Int,h2:Int)=income(h1,h2)-tax(income(h1,h2))

  print("Wage sallery is : ")
  print(wage(40))
  print("\n")

  print("OT sallery is : ")
  print(ot(20))
  print("\n")

  print("Income sallery is :")
  print(income(40,20))
  print("\n")

  print("Tax is : ")
  print(tax(income(40,20)))
  print("\n")

  print("TakeHome sallery is :")
  print(takeHome(40,20))


}
