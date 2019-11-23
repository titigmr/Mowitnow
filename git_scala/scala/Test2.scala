object Test2 extends App {

  var Parser = new Parser()

  println(s"Le jardin est de la taille suivante : ${Parser.coord_xmax}, ${Parser.coord_ymax}.")

  var depart = Parser.position.toList
  var attaque = Parser.commandes.toList
  var count = 1

  for ((i,j) <- (depart zip attaque)) {
    println(s"Tondeuse numéro : $count")
    new Tondeuse(i.split(" ")(0).toInt, i.split(" ")(1).toInt, i.split(" ")(2), j.split("").toList)
    count += 1
  }

}
