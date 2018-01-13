package edu.knoldus

import org.apache.log4j.Logger

class Operation {

  // Higher Order Method to implement sum of squares, cube, Int
  def sum(func: (Int, Int) => Int, number1: Int, number2: Int): Int = {
    func(number1, number2)
  }

  // Higher Order Method with tail recursion to calculate sum, product of list
  def operateList(list: List[Int], f: (Int, Int) => Int, count: Int): Int = {
    def innerOperate(list: List[Int], count: Int): Int = {
      list match {
        case head1 :: tail => innerOperate(tail, f(count, head1))
        case Nil => count
      }
    }
    innerOperate(list, count)
  }

}

  object Application extends App {
    //  log.info(test(4))
    val log = Logger.getLogger(this.getClass)
    val obj = new Operation
    val number1 = 5
    val number2 = 4
    val sumOfSquares = obj.sum((x, y) => (x * x) + (y * y), number1, number2)
    val sumOfCubes = obj.sum((x, y) => (x * x * x) + (y * y * y), number1, number2)
    val sumOfInt = obj.sum((x, y) => x + y, number1, number2)
    log.info(s"Sum of Cubes: $sumOfCubes \n")
    log.info(s"Sum of Squares: $sumOfSquares \n")
    log.info(s"Sum of Int: $sumOfInt \n")

    val listElement1 = 1
    val listElement2 = 2
    val listElement3 = 3
    val listElement4 = 4
    val list = List(listElement1, listElement2, listElement3, listElement4)
    val sumOfList = obj.operateList(list, (x, y) => x + y, 0)
    val productOfList = obj.operateList(list, (x, y) => x * y, 1)
    val maxOfList = obj.operateList(list, (x, y) => if (x > y) x else y, -1)
    log.info(s"Sum of List: $sumOfList \n")
    log.info(s"Product of List: $productOfList \n")
    log.info(s"Maximum element in list: $maxOfList")
  }
