package tuples

object tuple_test {

  def reverser(v1:Any, v2:Any, v3:Any) = (v3, v2, v1)
  
  def main(args : Array[String]) : Unit = {
    val one = reverser(0x2A, "World", "Hello")
    val (v3, v2, v1) = reverser("Hello", "World", "!")
    println(one)
    println(String.format("%s %s%s", v1.toString, v2.toString, v3.toString))
  }
  
}
