package sketch

import utest.*

object SketchTests extends TestSuite:
  def tests = Tests:
    test("build_object"):
      val result = build_object()
      println(result)
