package io.gitlab.mhammons

import jdk.incubator.foreign.CLinker
import scala.quoted.*

object compilerKiller:

  val instance = CLinker.getInstance

  inline def test = ${
    testImpl
  }

  def testImpl(using Quotes) =
    '{ println("test") }
