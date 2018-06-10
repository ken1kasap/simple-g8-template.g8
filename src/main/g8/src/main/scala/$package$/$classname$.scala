package $package$

import com.typesafe.scalalogging.LazyLogging

class $classname$ {
  def greet(): String = "This is built from Giter8 template project."
}

object $classname$ extends App with LazyLogging {
  val main = new $classname$
  logger.debug(main.greet())
}
