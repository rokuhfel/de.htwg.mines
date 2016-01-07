package controllers

import model.impl.Grid
/**
  * Created by Ron on 17.12.2015.
  */
class MainController {
    var grid = new Grid(4,4,3)

    def handleClick(x:Int,y:Int): Boolean ={
        toggleFlag(x,y)
    }

    def handleDblClick(x:Int,y:Int): Boolean ={
        openField(x,y)
    }

    def openField(x:Int,y:Int): Boolean ={
        grid.gridArray(x)(y).setOpened(true).hasBomb
    }

    def getCounter(x:Int,y:Int): Int = {
        grid.gridArray(x)(y).bombCounter
    }

    def toggleFlag(x:Int,y:Int): Boolean ={

        if(!grid.gridArray(x)(y).isFlagged){

            grid.gridArray(x)(y) = grid.gridArray(x)(y).setFlag(true)
        }
        else{

            grid.gridArray(x)(y) = grid.gridArray(x)(y).setFlag(false)
        }
         grid.gridArray(x)(y).isFlagged

    }

    def newGame(x:Int, y:Int, bombs:Int): Unit ={
        grid = new Grid(x,y,bombs)
    }
}
