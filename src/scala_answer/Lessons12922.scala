package scala_answer

/**
  * @author dave.th
  * https://programmers.co.kr/learn/courses/30/lessons/12906
  */
object Lessons12922 {
  def main(args: Array[String]) : Unit = {
    println(solution(5))
  }

  def solution(n : Int) : String = {
    var answer = ""
    for(_ <- 0 to n/2)
      answer += "수박"
    if(n % 2 != 0)
      answer += "수"

    answer
  }
}
