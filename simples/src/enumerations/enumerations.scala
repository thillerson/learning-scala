package enumerations

object enumerations {
  
  object Breed extends Enumeration {
	  val Doberman	= Value("Doberman Pinscher")
	  val Yorkie	= Value("Yorkshire Terrier")
	  val Scottie	= Value("Scottish Terrier")
	  val Dane		= Value("Great Dane")
	  val Portie	= Value("Portuguese Water Dog")
  }
  
  def main(args : Array[String]) : Unit = {
    
    println("ID\tBreed")
    for (breed <- Breed) println(breed.id + "\t" + breed)
    println("\nJust Terriers:")
    Breed.filter(_.toString.endsWith("Terrier")).foreach(println)
  }
  
}
