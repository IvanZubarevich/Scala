import scala.annotation.tailrec
import scala.io.StdIn

object main
{

    def recursiveAverage(elements: List[Double]): Double = {
        def average(elements: List[Double], size: Double): Double = elements match {
            case Nil => 0
            case x ::  tail => (x + average(tail, size - 1) * (size-1)) / size
        }
        average(elements, elements.length)
    }

    def tailRecursiveAverage(elements: List[Double]): Double = {
        @tailrec
        def average(elements: List[Double], sum: Double, counter: Int): Double = {
            elements match {
                case Nil => sum / counter
                case x :: tail => average(tail, sum + x, counter + 1)
            }
        }
        average(elements, 0, 0)
    }


  def recursiveReverse(str: String): String = {
    str match {
      case "" => ""
      case s => recursiveReverse(s.tail) + s.head
    }
  }

  def tailRecursiveReverse(str: String): String = {
    @tailrec
    def reverse(str: String, str1: String): String =
    {
      str match{
        case "" => str1
        case s => reverse(s.tail, s.head+str1)
      }
    }
    reverse(str, "")
  }


     def main(args: Array[String]): Unit = {
       println("Enter the size of array:")
       val range: Int = StdIn.readInt()
       println("Enter array:")
       val elements: List[Double] = List.fill(range){
         StdIn.readDouble()
       }
       println (s"Average: ${recursiveAverage(elements)}")
       println(s"Average(tail): ${tailRecursiveAverage(elements)}")
       println("Enter string:")
       val str: String = StdIn.readLine()
       println(s"Reverse string: ${recursiveReverse(str)}")
       println(s"Reverse string(tail): ${tailRecursiveReverse(str)}")
     }

}
