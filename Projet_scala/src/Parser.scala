import scala.collection.mutable.ListBuffer
import scala.io.Source

class Parser {

  val document = Source.fromFile("consignes.txt").getLines.toList

  var coord_xmax = document(0).split(" ")(0).toInt
  var coord_ymax = document(0).split(" ")(1).toInt

  var commandes = new ListBuffer[String]()
  var position = new ListBuffer[String]()

  for ((line, count) <- document.zipWithIndex) {
    if (count % 2 == 0 && count != 0) commandes += line
    if (count % 2 != 0 && count != 0) position += line
  }
}


