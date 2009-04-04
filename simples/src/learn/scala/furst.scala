package learn.scala

object furst {
  
  def main(args:Array[String]):Unit = {
    val up:Upper = new Upper
    Console.println(up.upper("my", "first", "scala", "program"))
  }
}
