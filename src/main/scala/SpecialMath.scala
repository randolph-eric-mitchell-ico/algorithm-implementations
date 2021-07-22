package com.igitcompany.algos

object SpecialMath{

  def main(args: Array[String]): Unit = {
    println(runRecursion(45));
  }
  def runRecursion(n: Long): Long = {
    if (n == 0)
      return 0
    else if (n == 1)
      return 1

    n + runRecursion(n - 1) + runRecursion(n - 2)
  }
}