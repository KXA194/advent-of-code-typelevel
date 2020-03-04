package advent.solutions

import org.scalatest.FlatSpec
import Day4._

class Day4Test extends FlatSpec {

  behavior of "isPasswordValid"

  it should "return true" in {
    assertResult(true) {
      isPasswordValid(111111)
    }
  }

  it should "return true2" in {
    assertResult(true) {
      isPasswordValid(122345)
    }
  }
  it should "return true3" in {
    assertResult(true) {
      isPasswordValid(111123)
    }
  }
  it should "return true4" in {
    assertResult(false) {
      isPasswordValid(135679)
    }
  }

  "AreTwoAdjDigitsTheSame" should "return true 1" in {
    assertResult(true) {
      AreTwoAdjDigitsTheSame(111111)
    }
  }
  "AreTwoAdjDigitsTheSame" should "return true 2" in {
    assertResult(true) {
      AreTwoAdjDigitsTheSame(122345)
    }
  }
  "AreTwoAdjDigitsTheSame" should "return true 3" in {
    assertResult(true) {
      AreTwoAdjDigitsTheSame(111123)
    }
  }
  "AreTwoAdjDigitsTheSame" should "return false 1" in {
    assertResult(false) {
      AreTwoAdjDigitsTheSame(135679)
    }
  }
}
