package scala_answer

/**
  * @author dave.th
  * https://programmers.co.kr/learn/courses/30/lessons/12943
  */
object Lessons12943 {
  def main(args: Array[String]) : Unit = {
    println(solution(626331))
  }

  def solution(num : Int) : Int = {
    var answer = 0
    var temp = num

    while (temp != 1) {
      temp = if(temp % 2 == 0) temp / 2 else temp * 3 + 1
      answer += 1
      if(answer == 450 && temp != 1) return -1 // 문제 에러인지... 예제에 있는 626331이 -1 이 인나옴
    }

    answer
  }
}
