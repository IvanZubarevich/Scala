import org.scalatest._

class Test extends FlatSpec with Matchers {
  "Average list value (recursion) 1" should "return 5.0" in {
    val list = List.range(1, 10)
    Main.recursiveAverage(list) should be(5.0)
  }

  "Average list value (recursion) 2" should "return 50.0" in {
    val list = List.range(1, 100)
    Main.recursiveAverage(list) should be(50.0)
  }

  "Average list value (tail recursion) 1" should "return 5.0" in {
    val list = List.range(1, 10)
    Main.tailRecursiveAverage(list) should be(5.0)
  }

  "Average list value (tail recursion) 2" should "return 50.0" in {
    val list = List.range(1, 100)
    Main.tailRecursiveAverage(list) should be(50.0)
  }

  "Reverse string (recursion) 1" should "navi" in {
    val str = "ivan"
    Main.recursiveReverse(str) should be("navi")
  }

  "Reverse string (recursion) 2" should "2 f 65 gtdbv aaa" in{
    val str = "aaa vbdtg 56 f 2"
    Main.recursiveReverse(str) should be("2 f 65 gtdbv aaa")
  }

  "Reverse string (tail recursion) 1" should "navi" in{
    val str = "ivan"
    Main.tailRecursiveReverse(str) should be("navi")
  }

  "Reverse string (tail recursion) 2" should "2 f 65 gtdbv aaa" in{
    val str = "aaa vbdtg 56 f 2"
    Main.tailRecursiveReverse(str) should be("2 f 65 gtdbv aaa")
  }
}