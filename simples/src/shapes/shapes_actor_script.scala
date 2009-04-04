package shapes

object shapes_actor_script {
  def main(args : Array[String]) : Unit = {
    ShapeDrawingActor.start
    ShapeDrawingActor ! Circle(Point(0.0, 0.0), 1.0)
    ShapeDrawingActor ! Rectangle(Point(0.0,0.0), 2, 5)
    ShapeDrawingActor ! 3.14159
    ShapeDrawingActor ! "exit"
  }
}
