package scala_answer
import scala.util.control.Breaks._


/**
  * @author dave.th
  * 소수찾기 : https://programmers.co.kr/learn/courses/30/lessons/12921
  */
object Lessons12921 {
  def main(args: Array[String]) : Unit = {
    println(solution(10))
  }

  def solution(n : Int) : Int = {
    var answer = 0
    for(i <- 2 to n) {
      var r = true
      val sartI = Math.sqrt(i).toInt
      breakable {
        for(j <- 2 to sartI) {
          if(i%j == 0) {
            r = false
            break
          }
        }
      }
      if(r) answer += 1
    }

    answer
  }
}
