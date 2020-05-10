import scala.io.StdIn


object Main {

  //Вариант 3: Найти сумму положительных элементов списка
  def sumPositive(elements: List[Int]): Int = {
    val takePositive: PartialFunction[Int, Int] = {
      case x: Int if x > 0 => x
    }
    elements.collect(takePositive).sum
  }

  //Вариант 3: Найти предпоследний элемент списка
  def findPenultimate(elements: List[Int]): Int =  {
    elements.foldLeft((elements.head, elements.tail.head))((r, c) => (r._2, c))._1
  }

  //Вариант 3: Преобразовать Map таким образом, чтобы ключи оригинального Map стали значениями преобразованного, и наоборот
  def reverse[T, U](map: Map[T, U]): Map[U, T] = {
    if (map.isEmpty) Map()
    Map() ++ map.map(_.swap)
  }


  def main(args: Array[String]): Unit = {
    println("Enter the size of array:")
    val range: Int = StdIn.readInt()
    println("Enter array:")
    val elements: List[Int] = List.fill(range){
      StdIn.readInt()
    }
    val map = Map [Int, String](1 -> "One", 2 -> "Two", 3 -> "Three")
    println(s"Sum of positive numbers: ${sumPositive(elements)}")
     elements match
    {
      case Nil => println ("Not found penultimate element! List is empty!")
      case x => println(s"Penultimate element: ${findPenultimate(elements)}")
    }
    println(s"Reverse Map: ${reverse(map)}")
 }
}



