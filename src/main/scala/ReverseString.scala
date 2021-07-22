package com.igitcompany.algos

object ReverseString {
  def main(args: Array[String]): Unit = {
    println(reverseIt("ReverseThisString"));
  }
  def reverseIt(string: String): String = {
    var hold = "";
    for(i <- string.length - 1 to 0 by -1){
      hold += string.charAt(i).toString
    }
    return hold
  }
}
