package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  
  println(contains(singletonSet(1), 2))
  
  var s = Set(1, 2,4,6)
  var s1 = Set(5,6,7,8,1,2)
  
  printSet(union(s, s1))
  printSet(intersect(s, s1))
  
  printSet(diff(s, s1))
  
  printSet(filter(s, i => true))
  
  println(forall(Set(1,2,3), i => i>1))
  println(forall(Set(2,3), i => i>1))
  println(forall(Set(1,2,3), i => i>=1))
  
  println(exists(Set(2,3), i => i==1))
}
