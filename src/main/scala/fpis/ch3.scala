package fpis


import annotation.tailrec

sealed trait LinkedList[+A]
case object Nil extends LinkedList[Nothing]
case class Cons[+A](head: A, tail: LinkedList[A]) extends LinkedList[A]

object LinkedList {
  def sum(ints: LinkedList[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }
}