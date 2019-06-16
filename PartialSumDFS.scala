object PartialSumDFS extends App {
  var a = Seq(1, 10, 49, 3, 8, 13, 7, 23, 60, -500, 42, 599, 45, -23, 1, 10, 49, 3 , 8, 13)
  var n = 20
  var k = 444

  def isMatchAndResult(index: Int, partial: Seq[Int]): (Boolean, Seq[Int]) = {
    if (index == n) {
      println(s"partial:${partial}")
      return if (partial.sum == k) (true, partial) else (false, Seq())
    }
    println(s"index:${index}, partial:${partial}")
    val (isMatchNotAdd, resultNotAdd) = isMatchAndResult(index + 1, partial)
    if (isMatchNotAdd) return (isMatchNotAdd, resultNotAdd)

    println(s"!!!!!index:${index}, partial:${partial}, a(index):${a(index)}")
    isMatchAndResult(index + 1, partial :+ a(index))
  }

  val (isMatch, result) = isMatchAndResult(0, Seq())
  if (isMatch) println(s"Yes ${result}") else println("No")
}
