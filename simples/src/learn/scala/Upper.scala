package learn.scala

class Upper {

  def upper(strings:String*):Collection[String] = {
    strings.map((s:String) => s.toUpperCase)
  }
}
