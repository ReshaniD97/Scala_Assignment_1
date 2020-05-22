object Wholesale extends App{
  def cal(x:Double)= if (x>50){
    (x-50)*0.75+3+(24.95*x*60/100)

  }else{
    3+24.95*x*60/100
  }
  print(cal(60))


}
