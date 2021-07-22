package com.igitcompany.algos

import java.util.Date;
import scala.collection.mutable.ListBuffer;

object DistinctTwos {
  def main(args: Array[String]): Unit = {
    // Find times within two ranges that have no more than two distinct numbers
    println(times("15:15:00","15:15:15"));
    println(times("22:22:11","22:22:13"));
  }

  def times(S: String, T: String): ListBuffer[String] = {
    val start_time = new Date("July 20, 2012 " + S);
    val end_time = new Date("July 20, 2012 " + T);
    val start_time_integers = start_time.getTime();
    val end_time_integers = end_time.getTime();
    val no_more_than_two_distinct_values: ListBuffer[String] = ListBuffer.empty[String];
    var time_holder = "";
    for(i <- start_time_integers to end_time_integers by 1000){
      time_holder = new Date(i).toString();
      if(hasNoMoreThanTwoDistincts(time_holder.substring(11,19))) {
        no_more_than_two_distinct_values += time_holder.substring(11, 19);
      }
    }

    return no_more_than_two_distinct_values;
  }

  def hasNoMoreThanTwoDistincts(date: String): Boolean = {
    val unq_values = ListBuffer.empty[Char];
    for(i <- 0 until date.length){
      if(unq_values.indexOf(date.charAt(i)) == -1 && date.charAt(i).toString() != ":")
        unq_values += date.charAt(i);
    }
    if(unq_values.length < 3)
      return true;
    else
      return false;
  }
}
