class Tondeuse (var coord_x : Int, var coord_y : Int, var orientation : String, var commande : List[String]) extends Parser {

    this.maPosition()
    this.faireCommandes()
    this.maPosition()

  def avancer() = {
    if ("N" == orientation && coord_y < coord_ymax) coord_y += 1
    if ("S" == orientation && coord_y > 0) coord_y -= 1
    if ("W" == orientation && coord_x > 0) coord_x -= 1
    if ("E" == orientation && coord_x < coord_xmax) coord_x += 1
    println(s"La tondeuse avance d'une case vers : $orientation. La nouvelle position est : ($coord_x, $coord_y)")
    println("-" * 100)
  }

  def tournerDroite() {
    orientation match {
      case "N" => orientation = "E"
      case "W" => orientation = "N"
      case "S" => orientation = "W"
      case "E" => orientation = "S"
    }
    println(s"La tondeuse tourne à droite. L'orientation est : $orientation")
    println("-" * 100)
  }

  def tournerGauche() {
  orientation match {
    case "N" => orientation = "W"
    case "W" => orientation = "S"
    case "S" => orientation = "E"
    case "E" => orientation = "N"
    }
    println(s"La tondeuse tourne à gauche. L'orientation est : $orientation")
    println("-" * 100)
  }

  def maPosition() {
    println("*" * 100)
    println("*" + " " * 98 + "*")
    println(s"        La position de la tondeuse est : ($coord_x,$coord_y) et son orientation est $orientation")
    println("*" + " " * 98 + "*")
    println("*" * 100)
  }

  def faireCommandes() {
    for (i <- commande) {
      if (i == "A") this.avancer()
      if (i == "G") this.tournerGauche()
      if (i == "D") this.tournerDroite()
    }
  }

}