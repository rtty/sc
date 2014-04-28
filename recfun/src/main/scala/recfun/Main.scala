package recfun
import common._

object Main {
  def main(args: Array[String]) {
    
    println("count=" + countChange(4, List(1,2)))

    return
    println("Pascal's Triangle")
    
    //println(pascal(50, 100))
    
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
    //println(c + " " + r)
    
    if((c == 0) || (c == r)) 1
    else pascal(c-1, r-1) + pascal(c, r-1)
    
    //if(r > c + 1) throw new IndexOutOfBoundsException
    
    
    // c = 1 r = 2 => 2
    
    
    
    /*
    if(c == 0 && r == 0) 1
    
    // c = 0 r = 2 => 1
    // c = 1 r = 2 => 2
    // c = 2 r = 2 => 1
    
    // c = 5 r = 5 => 1
    // c = 4 r = 5 => 5
    // c = 3 r = 5 => 10
    
    if(c==0 || c==1) 1
    else pascal(c-1, r-1) + pascal(c + 1, r + 1)
    */
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
	
	println(1)
	marker(chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    println(coins.mkString(" + "))
    
    //while()
    
    //if(money == 0 || coins.isEmpty) return count    
    
    //count += countChange(money - coins.head, coins.tail)
    
    0
  }
}
