object Q4 extends App {
  var ACNO1=new Account1( "986510004v", 86940,  10000.64)
  var ACNO2=new Account1("975105004v" ,86840 ,-8000.24)
  var ACNO3=new Account1( "966519014v" ,  86450 ,15000.34)
  var ACNO4=new Account1("976323415v",86740,-2520.20)

  val bank:List[Account1]=List[Account1](ACNO1,ACNO2,ACNO3,ACNO4)

  val find=(Id:String,bank:List[Account1])=> bank.filter(AC=>AC.Nic.equals(Id))
  val overdraft=(bank:List[Account1])=> bank.filter(AC=>AC.Balance<0)
  val balance=(bank:List[Account1])=> bank.reduce((AC1,AC2)=>new Account1(AC1.Nic,AC1.Acnumber,AC1.Balance+AC2.Balance))
  val interest=(bank:List[Account1])=>bank.map(AC=>if (AC.Balance>0) AC.Balance*1.05 else AC.Balance*1.1)
  val balanceWithInterest=(interest:List[Double])=>interest.reduce((interest1,interest2)=> interest1 + interest2)

  println("\nAccount with negative balances :"+overdraft(bank).toString())
  println("\nSum Of All Account Balances Rs: "+ balance(bank).Balance)
  println("\nFinal Balances Of All Accounts After Apply The Interest Function :"+balanceWithInterest(interest(bank)))

}
class Account1(Id:String,AcNo:Int,Bal:Double){
  val Nic:String=Id
  val Acnumber: Int = AcNo
  var Balance: Double = Bal

  override def toString:String ="["+Nic+" : "+Acnumber +" : "+ Balance+"]"

  def withdraw(amount:Double) = this.Balance-=amount

  def deposit(amount:Double) = this.Balance+=amount

  def transfer(account:Account1,amount:Double)={
    this.withdraw(amount)
    account.deposit(amount)
  }
}


