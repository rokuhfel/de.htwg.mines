package model

trait Cell{
  def setBombCount(bombCount: Int) :Cell
  def setOpened(opened: Boolean) :Cell
  def setFlag(flag: Boolean) :Cell
  def setBomb(bomb: Boolean): Cell
}