import org.scalatest.FlatSpec

class Test extends  FlatSpec with Matchers{
  "Sum of positive list elements 1" should "return 15" in {
    val elements = List(1,2,3,4,5)
    Main.sumPositive(elements) should be(15)
  }

  "Sum of positive list elements 2" should "return 8" in {
    val elements = List(1,-5,7,-3,-4)
    Main.sumPositive(elements) should be(8)
  }

  "Sum of positive list elements 3" should "return 0" in {
    val elements = List()
    Main.sumPositive(elements) should be(0)
  }

  "Penultimate element" should "return 19" in {
    val elements = List(5, -1, 58, 83, 19, -5)
    Main.findPenultimate(elements) should be(19)
  }

  "Reverse map" should "return Map(One -> 1, Two -> 2, Three -> 3)" in {
    val map = Map [Int, String](1 -> "One", 2 -> "Two", 3 -> "Three")
    Main.reverse(map) should be (Map("One" -> 1, "Two" -> 2, "Three" -> 3))
  }

  "Reverse map" should "return Map(ABC -> 123)" in {
    val map = Map [Int, String](123 -> "ABC")
    Main.reverse(map) should be (Map("ABC" -> 123))
  }

}
