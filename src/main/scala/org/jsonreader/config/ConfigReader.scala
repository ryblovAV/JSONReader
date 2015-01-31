package org.jsonreader.config

import scala.io.Source

object ConfigReader {

  def readScheme = {
    val bufferedSource = Source.fromFile("src/main/resources/DBScheme.json")
    val jsonStr = bufferedSource.getLines.mkString("")
    bufferedSource.close
    jsonStr
  }

}
