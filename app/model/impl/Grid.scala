package model.impl

import model.{Grid=>GridTrait}

import scala.util.Random

/**
  * Created by Ron on 17.12.2015.
  */
case class Grid (height: Int, width: Int, bombs: Int) extends GridTrait{
  var gridArray = Array.ofDim[Cell](height, width)
  val random = new Random()
  //var xy =
  var bombsToPlace = bombs
  instantiate()
  placeBombs()
  if(bombsToPlace > 0){
    placeBombs()
  }
  setBombCounters()


  //def openedField(x:Int,y:Int) = gridArray(x)(y).setOpened(true)
  def placeFlag(x:Int,y:Int) = gridArray(x)(y).setFlag(true)
  def showBombCounter(x:Int,y:Int) = gridArray(x)(y).bombCounter

  def placeBombs() = {
    for(i <- 0 until height; j <- 0 until width){
      var xy = random.nextInt(5)

      if(bombsToPlace > 0 && xy < 2){
        println(xy)
        gridArray(i)(j) = gridArray(i)(j).setBomb(true)
        bombsToPlace = bombsToPlace - 1
      }
    }

  }

  def setBombCounters() = {
    for (i <- 0 until height; j <- 0 until width) {
      var count = 0

      if( i > 0 && j > 0){
        if(gridArray(i - 1)(j - 1).hasBomb)count = count+1
      }

      if(i > 0){
        if(gridArray(i - 1)(j).hasBomb)count = count+1
      }

      if( j > 0){
        if(gridArray(i)(j - 1).hasBomb)count = count+1
      }

      if(i > 0 && j < width-1){
        if(gridArray(i - 1)(j + 1).hasBomb)count = count+1
      }

      if( j < width-1){
        if(gridArray(i)(j + 1).hasBomb)count = count+1
      }

      if( i < height-1 && j > 0){
        if(gridArray(i + 1)(j - 1).hasBomb)count = count+1
      }

      if( i < height -1 ){
        if(gridArray(i + 1)(j).hasBomb)count = count+1
      }

      if(i < height -1 && j < width -1){
        if(gridArray(i + 1)(j + 1).hasBomb)count = count+1
      }

      gridArray(i)(j) = gridArray(i)(j).setBombCount(count)
    }
  }


  def instantiate(): Unit ={
    println(height + "  " + width)
    for(i <- 0 until height; j <- 0 until width){
      gridArray(i)(j) = new Cell()
    }
  }
   def toString2(){
     println()
    for(i <- 0 until height){
      for(j <- 0 until width){
        if(gridArray(i)(j).hasBomb){
          if(gridArray(i)(j).isOpened){
            print("+1(" + gridArray(i)(j).bombCounter + ")" )
          }
          else{
            print("-1(" + gridArray(i)(j).bombCounter + ")" )
          }

        }
        else{
          if(gridArray(i)(j).isOpened){
            print("+0(" + gridArray(i)(j).bombCounter + ")")
          }
          else{
            print("-0(" + gridArray(i)(j).bombCounter + ")")
          }

        }

      }
      println()
    }
  }

  def openField(x:Int , y:Int): Boolean = {
    gridArray(x)(y) = gridArray(x)(y).setOpened(true)
    if(gridArray(x)(y).hasBomb){
      print("You   Lost")
      false
    }
    else{
       true
    }


  }

}
