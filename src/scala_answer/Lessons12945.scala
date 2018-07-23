package scala_answer

/**
  * @author dave.th
  * https://programmers.co.kr/learn/courses/30/lessons/12945
  */
object Lessons12945 {
  def main(args: Array[String]) : Unit = {
    println(solution(10000))
  }

  def solution(n : Int) : Int = {
    val map = scala.collection.mutable.Map[Int, BigInt]()
    map.put(0, 0)
    map.put(1, 1)

    for(i <- 0 to n)
      fibo(i, map)

    map.getOrElse(n, BigInt(0)).mod(1234567).toInt
  }

  def fibo(n : Int, map : scala.collection.mutable.Map[Int, BigInt]) : BigInt = {
    if(n == 0 || n == 1) return n

    val mapResult : BigInt = map.getOrElse(n, -1)
    if(mapResult > -1) return mapResult

    val result = fibo(n - 1, map) + fibo(n - 2, map)
    map.put(n, result)
    result
  }
}
