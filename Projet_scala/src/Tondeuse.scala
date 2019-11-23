class Tondeuse (var coord_x : Int, var coord_y : Int, var Orientation : String, var commande : List[String]) {

    this.maPosition()
    this.faireCommandes()
    this.maPosition()

    def avancer() = {
    if ("N" == Orientation) coord_y += 1
    if ("S" == Orientation) coord_y -= 1
    if ("W" == Orientation) coord_x -= 1
    if ("E" == Orientation) coord_x += 1
    println(s"La tondeuse avance d'une case vers : $Orientation. La nouvelle position est : ($coord_x, $coord_y)")
    println("-" * 100)
  }

  def tournerDroite() {
    Orientation match {
      case "N" => Orientation = "E"
      case "W" => Orientation = "N"
      case "S" => Orientation = "W"
      case "E" => Orientation = "S"
    }
    println(s"La tondeuse tourne à droite. L'orientation est : $Orientation")
    println("-" * 100)
  }

  def tournerGauche() {
  Orientation match {
    case "N" => Orientation = "W"
    case "W" => Orientation = "S"
    case "S" => Orientation = "E"
    case "E" => Orientation = "N"
    }
    println(s"La tondeuse tourne à gauche. L'orientation est : $Orientation")
    println("-" * 100)
  }

  def maPosition() {
    println("*" * 100)
    println("*" + " " * 98 + "*")
    println(s"        La position de la tondeuse est : ($coord_x, $coord_y) et son orientation est $Orientation")
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