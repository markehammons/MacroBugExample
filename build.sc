import mill.define.Target
import mill._, scalalib._, modules._

object core extends ScalaModule {
   def scalaVersion = "3.1.0"

   def forkArgs = Seq(
     "--add-modules",
     "jdk.incubator.foreign",
     "--enable-native-access",
     "ALL-UNNAMED"
   )
}
