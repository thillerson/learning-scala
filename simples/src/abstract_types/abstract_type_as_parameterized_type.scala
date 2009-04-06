//// this will freak out unless run from the cl with scala
//
//abstract class BulkReader[T] {
//  val source:T
//  def read:String
//}
//
//class StringBulkReader(val source:String) extends BulkReader[String] {
//  def read = source
//}
//
//import java.io._
//
//class FileBulkReader(val source:File) extends BulkReader[File] {
//  def read = {
//    val in = new BufferedInputStream(new FileInputStream(source))
//    val numBytes = in.available;
//    val bytes = new Array[Byte] (numBytes)
//    in.read(bytes, 0, numBytes)
//    new String(bytes)
//  }
//}
//  
//
////println(new StringBulkReader("Hello Scala!").read)
////println(new FileBulkReader(new File("./abstract_type_as_parameterized_type.scala")).read)
