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

  // Exercise 3.2
  def tail[A](list: LinkedList[A]): LinkedList[A] = list match {
    case Nil => Nil
    case Cons(_, list) => list
  }

  // Exercise 3.3
  def setHead[A](list: LinkedList[A], newValue: A): LinkedList[A] = list match {
    case Nil => sys.error("tail of empty list")
    case Cons(_, rest) => Cons(newValue, rest)
  }

  // Exercise 3.4
  def drop[A](list: LinkedList[A], n: Int): LinkedList[A] = ???
}