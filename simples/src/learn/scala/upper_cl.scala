package learn.scala

object upper_cl {

  def main(args:Array[String]) = {
    args.map(_.toUpperCase).foreach(printf("%s ", _))
    println("")
  }
  
}
