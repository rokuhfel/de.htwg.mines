package model

trait Cell{
  def setBombCount(bombCount: Int)
  def setOpened(opened: Boolean)
  def setFlag(flag: Boolean)
  def setBomb(bomb: Boolean)
}