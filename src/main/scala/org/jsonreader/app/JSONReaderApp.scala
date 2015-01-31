package org.jsonreader.app

import grizzled.slf4j.Logging
import org.jsonreader.config.{ConfigReader, ConfigParser}


object JSONReaderApp extends App with Logging {

  def readConfFromJson = {
    val masters = ConfigParser.parse(ConfigReader.readScheme)
    masters.foreach(info(_))
  }

  readConfFromJson

}
