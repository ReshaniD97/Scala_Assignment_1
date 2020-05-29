object Q2 extends App {
  def attendees(p:Int)=120+(15-p)/5*20
  print("Number of Attendees : ")
  print(attendees(20))
  print("\n")

  def revenue(p:Int)=p*attendees(p)
  print("Revenue is : ")
  print(revenue(20))

  print("\n")

  def cost(p:Int)=500+3*attendees(p)
  print("Cost is : ")
  print(cost(20))

  print("\n")

  def profit(p:Int)=revenue(p)-cost(p)
  print("Profit is : ")
  print(profit(20),profit(15))


}
