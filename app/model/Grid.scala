package model

trait Grid{
  def openField(x:Int, y:Int)
  def placeFlag(x:Int, y:Int)
  def showBombCounter(x:Int, y:Int)
}