package org.apache.bark.validility

class MetricsReq {
  var name: Int = 0
  var result: Any = null

  override def toString = {
    " name: " + name +
    " result: " + result
  }
}