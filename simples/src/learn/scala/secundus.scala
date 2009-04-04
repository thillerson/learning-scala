package learn.scala

object UpperToo {
  def upper(strings:String*) = strings.map(_.toUpperCase)
}
  
object secundus {
  
  def main(args:Array[String]):Unit = {
    Console.println(UpperToo.upper("my", "second", "scala", "program"))
  }
}
