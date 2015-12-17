package model.impl

import model.{Cell=>CellTrait}
/**
  * Created by Ron on 17.12.2015.
  */
case class Cell(isOpened: Boolean, hasBomb: Boolean, bombCounter: Int, isFlagged: Boolean) extends  CellTrait{
  def this() = this(false, false, 0, false)

  def setBombCount(x:Int) = copy(bombCounter=x)

  def setBomb(bomb: Boolean)= copy(hasBomb = bomb)

  def setOpened(opened: Boolean)= copy(isOpened = opened)

  def setFlag(flag: Boolean) = copy(isFlagged = flag)
}
