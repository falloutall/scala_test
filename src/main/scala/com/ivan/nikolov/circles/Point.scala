package com.ivan.nikolov.circles

import scala.math._

/**
 * A class that represents a point in the 2d plain.
 *
 * Adapted with permission from Nayuki's source code
 * (http://nayuki.eigenstate.org/page/smallest-enclosing-circle)
 */
case class Point(x: Double, y: Double) {

  def subtract(point: Point): Point =
    Point(x - point.x, y - point.y)

  def distance(point: Point): Double =
    hypot(x - point.x, y - point.y)

  def cross(point: Point): Double =
    x * point.y - y * point.x

  def normal: Double = x * x + y * y

  override def toString: String = "Point(x = %f; y = %f)".format(x, y)
}
