package controllers

import UIs.TUI
import model.impl.Grid
import java.util.Scanner

/**
  * Created by Ron on 21.12.2015.
  */
object Main {
  def main(args: Array[String]){
   // val tui = new TUI()
   val c =  new MainController()


    println(c.handleClick(0,0))
    println(c.handleClick(0,0))
    println(c.handleClick(0,0))
    println(c.handleClick(0,0))

  /*  val kb = new Scanner(System.in)
    val grid = new Grid(4,4,5)
    grid.toString3()

    var x = 0
    var y = 0
    var game = true
    while(game){
      print("X: ")
      x = kb.nextInt()
      print("Y: ")
      y = kb.nextInt()
      game = grid.openField(x,y)
      grid.toString3()
    } */
  }
}
