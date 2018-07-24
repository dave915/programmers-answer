package scala_answer

/**
  * @author dave.th
  * https://programmers.co.kr/learn/courses/30/lessons/12939
  */
object Lessons12939 {
  def main(args: Array[String]) : Unit = {
    println(solution("-1 -1"))
  }

  def solution(s: String) : String = {
    val array = s.split(" ").map(i => i.toInt)
    array.min + " " + array.max
  }
}
