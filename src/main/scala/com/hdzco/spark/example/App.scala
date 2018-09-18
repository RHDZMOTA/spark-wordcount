package com.hdzco.spark.example

import org.apache.spark.sql._
import com.hdzco.spark.example.config._

object App extends Context {
  import spark.implicits._
  final case class WordCount(word: String, count: Long)

  val readPath: String  = Settings.Data.read
  val writePath: String = Settings.Data.write

  val data: Dataset[String] = spark.read.textFile(readPath)
  val wordCount: Dataset[WordCount] = data
    .flatMap(_.split("""\s+""")).map(_.toLowerCase.replaceAll("[^A-Za-z0-9]", "")).filter(_.length > 1)
    .groupByKey(identity).count().map({case (w, c) => WordCount(w, c)})
    .sort($"count".desc)
    .cache()

  def main(args: Array[String]): Unit = {
    wordCount.coalesce(1).write.csv(writePath)
    wordCount.show()
  }
}
