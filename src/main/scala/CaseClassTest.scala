case class Book(isbn: String)
case class Message(sender: String, recipient: String, body: String)

object CaseClassTest {
  def main(args:Array[String]){
    //注意在实例化案例类Book时，并没有使用关键字new，这是因为案例类有一个默认的apply方法来负责对象的创建。
    val frankenstein = Book("978-0486282114")

    printf("isbn:%s\n", frankenstein.isbn)


    //当你创建包含参数的案例类时，这些参数是公开（public）的val
    val message1 = Message("test stest test guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

    println(message1.sender)  // prints guillaume@quebec.ca
//    message1.sender = "travis@washington.us"  // this line does not compile
  }

}
