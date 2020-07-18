object CaserCiper extends App{
  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val inputString="university"

  val EncryptChar=(c:Char,ShiftKey:Int,a:String)=>a((a.indexOf(c.toUpper)+ShiftKey)%a.size)
  val DecryptChar=(c:Char,ShiftKey:Int,a:String)=>a((a.indexOf(c.toUpper)-ShiftKey+a.size)%a.size)

  val cipher=(algo:(Char,Int,String)=>Char,inputString:String,ShiftKey:Int,a:String)=>inputString.map(algo(_ ,ShiftKey,a))

  val Encrypt= cipher(EncryptChar,inputString,5,alphabet)
  val Decrypt= cipher(DecryptChar,Encrypt,5,alphabet)

  print("\n")
  println("Text :"+" "+inputString)
  println("Encrypt Text :"+" "+ "=> "+Encrypt)
  println("Decrypt Text :"+" "+"=> "+Decrypt)
}
