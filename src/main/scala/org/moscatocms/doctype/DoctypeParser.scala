package org.moscatocms.doctype

import spray.json._
import DoctypeJsonProtocol._

object DoctypeParser {
  
  def parse(json: String): DoctypeDefinition =
    json.parseJson.convertTo[DoctypeDefinition]
  
}