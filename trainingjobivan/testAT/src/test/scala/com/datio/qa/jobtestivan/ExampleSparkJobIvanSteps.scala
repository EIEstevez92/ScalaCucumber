package com.datio.qa

import com.datio.integration.utils.exec.RunSpark
import com.datio.integration.utils.read.KafkaMetricReader
import cucumber.api.scala.{EN, ScalaDsl}
import org.apache.avro.generic.GenericRecord
import org.scalatest.Matchers

class ExampleSparkJobIvanSteps extends Matchers with ScalaDsl with EN {

  var Var1: Int = 5
  var Var2: Int = 6
  var Resultado: Int = 11

  //********************************** Ivan ***********************************//

  Given("""^varx1 is (.*) and varx2 is (.*) values$""") {
    (valor1 : Int, valor2: Int) =>
      assert(Var1.equals(valor1))
      assert(Var2.equals(valor2))

      print("Se validaron las valriables")
  }

  When("""^make the sum Varx1 and Varx2$"""){
    print("Make the sum" + Var1 + Var2)
  }

  Then("""^result is (.*)$"""){
    (Res : Int) =>
      assert(Resultado.equals(Res))

      print("El resultado fue "+ Resultado)
  }

  //***************************************************************************//

}

