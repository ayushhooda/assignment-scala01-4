package edu.knoldus

import org.apache.log4j.Logger

class Operation {

  // Higher Order Method to implement sum of squares, cube, Int
  def sum(f: (Int, Int) => Int, number1: Int, number2: Int): Int = {
    f(number1, number2)
  }

  // Tail Recursion to implement sum, product, max in list
//  def operateList(list: List[Int], operation: String, f: (List[Int]) => Int): Int = {
//    operation match {
//      case sum =>
//      case product =>
//      case max =>
//    }
//  }
}

object Application extends App {

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

//  val listElement1 = 1
//  val listElement2 = 2
//  val listElement3 = 3
//  val listElement4 = 4
//  val list = List(listElement1, listElement2, listElement3, listElement4)
//  val sumOfList = obj.operateList(list, "sum", List()
//  => for (i <- list.length - 1 until -1 by -1) yield list
//  ) )
//  val productOfList = obj.operateList(list, "product",)
//  val maxOfList = obj.operateList(list, "max",)
//  log.info(s"Sum of List: $sumOfList \n")
//  log.info(s"Product of List: $productOfList \n")
//  log.info(s"Maximum element in list: $maxOfList")

}
