package loops

object for_comprehensions {
  
  def main(args : Array[String]) : Unit = {
    val things = List("Foo", "Bar", "Baz", "Bli")
    
    // simple generator (<- is called a generator)
    for (thing <- things) println(thing)
    
    // with a filter
    for (thing <- things if thing.contains("Foo")) println(thing)
    
    // complex filter
    for (thing <- things
         if thing.startsWith("B"); // <- separate filters with ;
         if ! thing.endsWith("z")
    ) println(thing)

    // complex filter
    for { thing <- things
         if thing.startsWith("B") // <- don't have to separate filters with ; if for starts with {
         if thing.endsWith("z")
    } println(thing)
    
    // yielding filtered values
    val frenchFoos = for {
      thing <- things
      if thing.startsWith("B")
      if thing.endsWith("i")
    } yield thing
    println("The French Foo is " + frenchFoos)
    
    // vals in a comprehension
    for { thing <- things
      lowered = thing.toLowerCase
    } println(lowered)
    
    // vals yielded from a comprehension
    val loweredThings = for { thing <- things
      lowered = thing.toLowerCase
    } yield lowered
    println(loweredThings)
  }
  
}
