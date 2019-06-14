import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt, num: BigInt): BigInt = if (i == 0) num else factorial(i - 1, num * i)

  println(factorial(10000, 1))
}
