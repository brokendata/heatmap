package com.brokendata
import scalaz._
import Scalaz._
import effect._
import java.io.File
import java.awt._
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import java.util.Locale

object Heatmap{
  val backgroundImageFileName = "world-map.png"

  case class Dimension(width: Int, height: Int)
  case class Point(x: Int, y: Int)

  Dimension(1000,500)

  def readImage = IO[BufferedImage]{
    val source = ImageIO.read(Heatmap.this.getClass.getClassLoader.getResourceAsStream(backgroundImageFileName))
    source
  }

  def calculateHeat(lat: Int, long: Int, imageWidth, imageHeight) = ???

  def ToXY(lat: Int, lon: Int, dim: Dimension): Point = {
    val x = (dim.width * (0.5 + lon / 360)).toInt
    val y = (dim.height * (0.5 - lat / 180)).toInt
    Point(x,y)
  }


}
