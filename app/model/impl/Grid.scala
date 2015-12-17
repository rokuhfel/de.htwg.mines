package model.impl

import model.{Grid=>GridTrait}
/**
  * Created by Ron on 17.12.2015.
  */
case class Grid (height: Int, width: Int, bombs: Int) extends GridTrait{
  var gridArray = Array.ofDim[Cell](height, width)

  for(i <- 1 until height; j <- i until width){
    gridArray(i)(j) = new Cell()
  }

  def openedField(x:Int,y:Int) = gridArray(x)(y).setOpened(true)
  def placeFlag(x:Int,y:Int) = gridArray(x)(y).setFlag(true)
  def showBombCounter(x:Int,y:Int) = gridArray(x)(y).bombCounter
  def placeBombs() = {

  }

  def openField(x:Int, y:Int) = {

  }
}
