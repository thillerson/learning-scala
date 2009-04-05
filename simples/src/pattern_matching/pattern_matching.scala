package pattern_matching

object pattern_matching {

  def main(args : Array[String]) : Unit = {
    
    // simple matcher
    val bools = List(true, false)
    for (bool <- bools) {
      bool match {
        case true	=> println("heads")
        case false	=> println("tails")
        case _		=> println("edge")
      }
    }
    
    // vals in matchers
    import scala.util.Random
    val randy = new Random nextInt 10
    randy match {
      case 7			=> println("lucky sevens!")
      case otherNumber	=> println(String.format("lame %s", otherNumber toString))
    }
    
    // match on type
    val things = List(23, "foo", 0x2A, '¹')
    for (thing <- things) {
      thing match {
        case i:Int		=> println("Integer: " + i)
        case s:String	=> println("String: " + s)
        case other		=> println("some other crap: " + other)
      }
    }
    
    // matching on sequences
    val willWork = List(1, 3, 23, 90)
    val willNotWork = List(4, 18, 52)
    
    for (l <- List(willWork, willNotWork)) {
      l match {
        case List(_, 3, _, _)	=> println("Four elements in this list with the second equalling 3.")
        case List(_*)			=> println("Some other wierd list")
      }
    }
    
    // matching on tuples
    val tupA = ("foo", "bar")
    val tupB = ("baz", "bli")
    for (tup <- List(tupA, tupB)) {
      tup match {
        case (thingOne, thingTwo) if thingOne == "foo"	=> println("found a foo")
        case (thingOne, thingTwo) 						=> println("found two things: " + thingOne + "," + thingTwo)
      }
    }
    
    // case classes
    case class Person(name:String, age:Int)
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)
    
    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25)	=> println("found Alice")
        case Person("Bob", age)		=> println("found Bob, aged: " + age)
        case p						=> println("found some other dork: " + p toString)
      }
    }
    
    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person(name, age) if age == 32	=> println("found a 32 year old: " + name)
        case _								=> 
      }
    }
    
    // exceptions
    import java.util.Calendar
    val then = null
    val now = Calendar getInstance
      
    try {
      now compareTo then
    } catch {
      case e:NullPointerException	=> println("the dreaded NPE!"); System.exit(-1)
      case other					=> println("not sure what happened"); System.exit(-1)
    } finally {
      println("finally!")
    }
  }
  
}
