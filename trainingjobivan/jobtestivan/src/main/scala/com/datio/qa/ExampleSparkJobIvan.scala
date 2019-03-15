package com.datio.qa

import com.datio.spark.InitSpark
import com.datio.spark.metric.model.BusinessInformation
import com.typesafe.config.Config
import org.apache.spark.sql.SparkSession

/**
  * Main file for ExampleSparkJobIvan process.
  * Implements InitSpark which includes metrics and SparkSession.
  *
  * Configuration for this class should be expressed in HOCON like this:
  *
  * ExampleSparkJobIvan {
  *   ...
  * }
  *
  */
protected trait ExampleSparkJobIvanTrait extends InitSpark {
  this: InitSpark =>
    /**
      * @param spark Initialized SparkSession
      * @param config Config retrieved from args
      */
    override def runProcess(spark : SparkSession, config : Config): Int = {

      this.logger.info("Init process ExampleSparkJobIvan")

      val exitCode = 0

      exitCode

    }

  override def defineBusinessInfo(config: Config): BusinessInformation =
    BusinessInformation(exitCode = 0, entity = "", path = "", mode = "",
                        schema = "", schemaVersion = "", reprocessing = "")

}

object ExampleSparkJobIvan extends ExampleSparkJobIvanTrait with InitSpark

