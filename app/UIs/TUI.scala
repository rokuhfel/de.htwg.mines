package UIs

import java.util.Scanner
import model.impl.Grid
/**
  * Created by Ron on 30.12.2015.
  */
class TUI {
  val scanner = new Scanner(System.in)
  var grid : Grid = null
  println("Hello, welcome to Mines!")
  println("What size do you want to play?")
  println("(1) 3x3")
  println("(2) 4x4")
  println("(3) 5x5")
  val size = scanner.nextInt()
  size match{
    case 1 => print("1")
       grid = new Grid(3,3,3)
    case 2 =>  print("2")
       grid = new Grid(4,4,3)
    case 3 =>  print("3")
       grid = new Grid(5,5,3)
    case _ =>  print("error")

  }
  grid.toString3()

  var game = true
  while(game){
    println("Flag(f) or Open(o)?")
    val option = scanner.next()
    print("X: ")
    val x = scanner.nextInt()
    print("Y: ")
    val y = scanner.nextInt()
    if(option == "f"){
      grid.placeFlag(x,y)
    }
    else{
      game = grid.openField(x,y)
    }
    grid.toString3()
  }
}
