package recfun
import common._

object Main {
  def main(args: Array[String]) {    
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    
    if((c == 0) || (c == r)) 1
    else pascal(c-1, r-1) + pascal(c, r-1)
    
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

	def marker(list: List[Char], opened:Int = 0) : Boolean = {
		if(opened < 0 || list.isEmpty) opened == 0
		else if(list.head == '(')marker(list.tail, opened+1) 
		else if(list.head == ')')marker(list.tail, opened-1)
		else marker(list.tail, opened)
	}
	
	marker(chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    
    if(money == 0) 1
    else if(money < 0 || coins.isEmpty) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
   
  }
}
