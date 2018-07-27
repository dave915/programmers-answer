package scala_answer

/**
  * @author dave.th
  * https://programmers.co.kr/learn/courses/30/lessons/12924
  */
object Lessons12924 {
  def main(args: Array[String]) : Unit = {
    println(solution(15))
  }

  def solution(n : Int) : Int = {
    var count = 0
    for(i <- 1 to n) {
      var sum = 0
      for(j <- i to n; if sum < n) {
        sum = sum + j
        if(sum == n) count = count + 1
      }
    }

    count
  }
}
