object Code1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  2+3                                             //> res0: Int(5) = 5
  var a:Int  =   123                              //> a  : Int = 123
  val b:Int =345                                  //> b  : Int = 345
  var bol1 = true                                 //> bol1  : Boolean = true
  1 to 10                                         //> res1: scala.collection.immutable.Range.Inclusive = Range 1 to 10
  val list1 = List(1 to 10)                       //> list1  : List[scala.collection.immutable.Range.Inclusive] = List(Range 1 to 
                                                  //| 10)
  println(list1)                                  //> List(Range 1 to 10)
  
  def list_Creator(x:Int, y:Int) = List(x to y)   //> list_Creator: (x: Int, y: Int)List[scala.collection.immutable.Range.Inclusiv
                                                  //| e]
  println(list_Creator(2,4))                      //> List(Range 2 to 4)
  
}
