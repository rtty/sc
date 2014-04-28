package example

object Work {

	var s = Lists.sum(null)                   //> java.lang.NullPointerException
                                                  //| 	at example.Lists$.sum(Lists.scala:26)
                                                  //| 	at example.Work$$anonfun$main$1.apply$mcV$sp(example.Work.scala:5)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at example.Work$.main(example.Work.scala:3)
                                                  //| 	at example.Work.main(example.Work.scala)
	
}