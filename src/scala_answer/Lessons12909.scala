package scala_answer

import scala.collection.mutable

/**
  * @author dave.th
  * https://programmers.co.kr/learn/courses/30/lessons/12909
  */
object Lessons12909 {
  def main(args: Array[String]) : Unit = {
    println(solution("()()"))
  }

  def solution(s : String) : Boolean = {
    val stack = new mutable.Stack[Char]

    for(i <- s.toCharArray) {
      if("(".charAt(0).equals(i)) {
        stack.push(i)
      } else {
        if(stack.isEmpty) return false
        stack.pop
      }
    }

    stack.isEmpty
  }
}
