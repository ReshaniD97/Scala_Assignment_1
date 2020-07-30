object Q3 extends App {
  var ACNO1=new Account( "986510004v", 86940,  10000.64)
  var ACNO2=new Account("975105004v" ,86840 ,8000.24)
  var ACNO3=new Account( "966519014v" ,  86450 ,15000.34)

  val bank:List[Account]=List[Account](ACNO1,ACNO2,ACNO3)

  println("\nAccount Balance Before The Transfer")
  for(details<-bank){
    println(details)
  }

  println("\nAccount Balance After The Transfer")
  bank(0).transfer(bank(1),1000.34)
  bank(2).transfer(bank(1),6000.44)
  for(details<-bank){
    println(details)
  }

}
class Account(Id:String,AcNo:Int,Bal:Double){
  val Nic:String=Id
  val Acnumber: Int = AcNo
  var Balance: Double = Bal

  override def toString:String ="["+Nic+" : "+Acnumber +" : "+ Balance+"]"

  def withdraw(amount:Double) = this.Balance-=amount

  def deposit(amount:Double) = this.Balance+=amount

  def transfer(account:Account,amount:Double)={
                                   this.withdraw(amount)
                                   account.deposit(amount)
                                }
 }
