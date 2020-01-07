/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */
import sbt._

object Common {
  def allFiles(file: File): Seq[File] = file.***.filter(_.isFile).get
}
