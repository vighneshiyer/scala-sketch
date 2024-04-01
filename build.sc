import mill._, scalalib._

object sketch extends RootModule with ScalaModule {
  def scalaVersion = "3.4.1"
  def ivyDeps = Agg(
    ivy"com.lihaoyi::scalatags:0.12.0",
    ivy"com.lihaoyi::mainargs:0.6.2"
  )

  object test extends ScalaTests {
    def ivyDeps = Agg(ivy"com.lihaoyi::utest:0.8.2")
    def testFramework = "utest.runner.Framework"
  }
}
