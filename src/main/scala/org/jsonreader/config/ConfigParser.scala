package org.jsonreader.config

import org.jsonreader.models.{MasterDetailRef, TableKey}
import play.api.libs.functional.syntax._
import play.api.libs.json._


object ConfigParser {

  implicit val TableKeyReads: Reads[TableKey] = (
    (__ \ 'table).read[String] and
      (__ \ 'column).readNullable[String]
    )(TableKey.apply _)

  implicit val MasterReads: Reads[MasterDetailRef] = (
    (__ \ 'master).read[TableKey] and
      (__ \ 'details).read[List[TableKey]]
    )(MasterDetailRef.apply _)

  def parse(confStr:String):List[MasterDetailRef] = {

    val conf = Json.parse(confStr)

    (conf \ "masterDetailRefs").as[List[MasterDetailRef]]
  }

}

