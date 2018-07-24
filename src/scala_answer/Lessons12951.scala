package scala_answer

/**
  * @author dave.th
  * https://programmers.co.kr/learn/courses/30/lessons/12951
  */
object Lessons12951 {
  def main(args: Array[String]) : Unit = {
    println(solution("3people  uuunFollowed me "))
  }

  def solution(s : String) : String = {
    var arr = s.toLowerCase.split(" ")
    for(i <- arr.indices)
      if(arr(i).length > 0)
        arr(i) = arr(i).replaceFirst(arr(i).charAt(0).toString, arr(i).charAt(0).toString.toUpperCase)

    if(s.lastIndexOf(" ") == s.length -1) arr.mkString(" ") + " " else arr.mkString(" ")
  }
}
