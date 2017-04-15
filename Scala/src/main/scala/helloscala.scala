import java.text.MessageFormat

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Clay on 2017/3/26.
  */
object helloscala {
  def main(args: Array[String]): Unit = {
//    println("hello scala");
//    print(decorate("sss") + "\n")
//    print(facx(10) + "\n")
//    print(sum(1,2,3,4) + "\n")
//    print(sum(1 to 5 : _*) + "\n")
//    print(recursiveSum(1 to 5 : _*) + "\n")
//    print(str + "\n")
//    print("ssss" + "\n")
//    print(xxxx(10) + "\n")
//    print(decorates("s") + "\n")
//    xxxxx()
//    print(pratice(-4) + "\n")
//    xxxxxxx()
//    print(0 until(10))
    ss()

  }
//  val s = "hello"
//  var sum = 0
//  for (i <- 0 until s.length )
//    sum += s(i)
//
//  for (i <- 1 to 3; j <- 1 to 3)
//    print((10 * i + j) + "")

  def abs(x : Double) = if (x >= 0) x else -x;

  def fac(n : Int) = {
    var r = 1
    for (i <- 1 to n) r = r * i;
    r
  }

  def facx(n : Int) : Int = if (n <= 0) 1 else n * facx(n - 1)

  def decorate(str : String, left: String = "{", right: String = "}") = left + str + right

  def sum(args : Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  def recursiveSum(args : Int*) : Int = {
    if (args.length == 0) 0
    else args.head + recursiveSum(args.tail : _*)
  }

  var str = MessageFormat.format("The answer to {0} is {1}", "everything", 42.asInstanceOf[AnyRef])

  def box(s : String) : Unit = {
    print(s)
  }

  def xx(x : Int) : Double = {
    if (x >= 0) {
      Math.sqrt(x)
    }
    else {
      throw new IllegalArgumentException("x should not be negative")
    }
  }

  def xxx(x : Int): Unit = {

  }

  def xxxx(x : Int) : Unit = {
    for (s <- 0 to x) {
      print(s)
    }
  }

  def decorates(str: String, left: String = "[", right: String = "]"): String = {
    left + str + right
  }

  def xxxxx() : Unit = {
    var str = MessageFormat.format("The answer to {0} to  {1}", "everything", 42.asInstanceOf[AnyRef])
    print(str + "\n")
  }

  def pratice(x : Int) : Int = {
    if (x > 0) {
      1
    }
    else if (x < 0) {
      -1
    }
    else {
      0
    }
  }

  def xxxxxx(): Unit = {

  }

  def xxxxxxx(): Unit = {
    for (i <- 10 to 0) {
      print(i)
    }
  }
  def ss(): Unit = {
//    val nums = new Array[Int](10);
//    print(nums(1))
//    val a = new Array[String](10);
//    print(a(1))
//    val s = Array("Hello", "World")
//    s(0) = "GoodBye"
//    print(s(0))
    val b = new ArrayBuffer[Int]()

    b.+=(1)
    b.+=(2,3,4,5)
    b.++= (Array(2,3,4))
    b.trimEnd(5)
    b.insert(2, 6)
    b.insert(2, 7, 8, 9)
//    b.remove(2)
//    b.remove(2, 3)
    b.toArray
//    b.toBuffer

//    for (i <- 0 until b.length)
//      print(1 + ": " + b(i))
//
//    for (i <- 0 until(b.length, 2))
//      print(2 + ": " + b(i))
//
//    for (i <- (0 until(b.length)).reverse)
//      print(3 + ": " + b(i))
//
//    for (elem <- b)
//      print(4 + ": " + elem)
//
//    val a1 = Array(2, 3, 5, 7, 11)
//    val result = for (elem <- a1) yield 2 * elem
//
//    val result1 = for (elem <- a1 if elem % 2 == 0) yield 2 * elem
//    val result2 = a1.filter(_ % 2 == 0).map(2 * _)
//    val result3 = a1.filter( _ % 2 == 0).map(2 * _ )
    for (elem <- b)
      print(elem)

    def products = b.filter(o => o % 2 == 0)

    for (elem <- products)
      print(elem)
//    print(products)
  }

  

 }
