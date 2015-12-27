package model.impl

import model.{Cell=>CellTrait}
/**
  * Created by Ron on 17.12.2015.
  */
case class Cell(isOpened: Boolean, hasBomb: Boolean, bombCounter: Int, isFlagged: Boolean) extends  CellTrait{
  def this() = this(false, false, 0, false)

  def setBombCount(x:Int) : Cell = copy(bombCounter=x)

  def setBomb(bomb: Boolean): Cell = copy(hasBomb = bomb)

  def setOpened(opened: Boolean) : Cell = copy(isOpened = opened)

  def setFlag(flag: Boolean) :Cell  = copy(isFlagged = flag)
}
