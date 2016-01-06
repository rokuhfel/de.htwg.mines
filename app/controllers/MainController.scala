package controllers

import model.impl.Grid
/**
  * Created by Ron on 17.12.2015.
  */
class MainController {
    var grid = new Grid(4,4,3)

    def handleButtonPress(x: Int, y: Int, variant: Int): String ={
        var response = ""
        if(variant == 1){
            toggleFlag(x,y)
            response = grid.gridArray(x)(y).bombCounter.toString
        }
        else{
            openField(x,y)
            response = grid.gridArray(x)(y).hasBomb.toString
        }
        response

    }

    def openField(x:Int,y:Int) ={
        grid.gridArray(x)(y).setOpened(true)
    }

    def toggleFlag(x:Int,y:Int): Boolean ={
        if(grid.gridArray(x)(y).isFlagged){
            grid.gridArray(x)(y).setFlag(false)
        }
        else{
            grid.gridArray(x)(y).setFlag(true)
        }
        grid.gridArray(x)(y).isFlagged
    }

    def newGame(x:Int, y:Int, bombs:Int): Unit ={
        grid = new Grid(x,y,bombs)
    }
}
