package options

object option_some_none {
  def main(args : Array[String]) : Unit = {
    
    val things = Map(
      "Foo" -> "Bar",
      "Baz" -> "Bizzle",
      "Bli" -> "Thing"
    )
    
    println(String.format("Foo: %s", things.get("Foo")))
    println(String.format("Foo: %s", things.get("Foo").get))
    println(String.format("Foo: %s", things.get("Foo").getOrElse("Whoops!")))
    println(String.format("Cranky: %s", things.get("Cranky")))
    println(String.format("Cranky: %s", things.get("Cranky").getOrElse("Whoops!")))
    println(String.format("Cranky: %s", things.get("Cranky").getOrElse(null)))
    
  }
}
