package org.jsonreader.models

case class TableKey(table:String,column:Option[String])

case class MasterDetailRef(master:TableKey, details:List[TableKey])

