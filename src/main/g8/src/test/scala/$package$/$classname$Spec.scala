package $package$

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class $classname$Spec extends AnyFlatSpec with Matchers {

  behavior of "$classname$#greet"

  it should "greet" in {
    val target = new $classname$
    val result = target.greet

    result should equal("This is built from Giter8 template project.")
  }
}
