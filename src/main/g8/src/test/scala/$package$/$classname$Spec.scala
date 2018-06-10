package $package$

import org.scalatest._
import Matchers._

class $classname$Spec extends FlatSpec {

  behavior of "$classname$#greet"

  it should "greet" in {
    val target = new $classname$
    val result = target.greet

    result should equal ("This is built from Giter8 template project.")
  }
}
