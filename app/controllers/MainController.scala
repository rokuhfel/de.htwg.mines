package controllers

import model.impl.Grid
/**
  * Created by Ron on 17.12.2015.
  */
class MainController {
  def main(args: Array[String]){
    val grid = new Grid(1,1,1)
    grid.toString()
  }
}
