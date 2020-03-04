package advent.solutions

object Day4 {

  def numberOfValidPasswords(lowerEnd: Int, UpperEnd: Int): Int = {
    val potentialPasswords: LazyList[Int] =
      LazyList.range(lowerEnd, UpperEnd + 1, 1)

    ???
  }

  def isPasswordValid(password: Int): Boolean = {
    val stringPassword: Iterator[List[Char]] =
      password.toString.toList.sliding(2)
    val out1 = stringPassword.exists(p => p.head == p.last)
    val out2 = stringPassword.forall(p => p.last >= p.head)
    out1 && out2
  }

  @deprecated
  def isPasswordValid2(password: Int): Boolean = {
    val stringPassword: Iterator[List[Char]] =
      password.toString.toList.sliding(2)
    val out1 = stringPassword.forall(p => p.last >= p.head)
    val out2 = stringPassword.exists(p => p.head == p.last)
    out1 && out2
  }

  def AreTwoAdjDigitsTheSame(password: Int): Boolean = {
    val stringPassword: Iterator[List[Char]] =
      password.toString.toList.sliding(2)
    stringPassword.exists(p => p.head == p.last)
  }

  def main(args: Array[String]): Unit = {
//      println(isPasswordValid(111123))
    println(isPasswordValid2(111123))
//    println(AreTwoAdjDigitsTheSame(111123))
  }
}
