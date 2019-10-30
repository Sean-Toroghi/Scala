package Scala_exercise

object Exercise1_list_hash {
  println("Create HashMap1 and display key&variables, remove a variable by key, and add another variable by key")
                                                  //> Create HashMap1 and display key&variables, remove a variable by key, and add
                                                  //|  another variable by key
  import scala.collection.mutable.HashMap
  val hashMap1: HashMap[String, Long] = HashMap(("Income", 34000000),("NameId", 1),("Phone", 4103732), ("AreaCode", 310))
                                                  //> hashMap1  : scala.collection.mutable.HashMap[String,Long] = Map(NameId -> 1,
                                                  //|  AreaCode -> 310, Phone -> 4103732, Income -> 34000000)
  println(s"Elements of hashMap1 = $hashMap1")    //> Elements of hashMap1 = Map(NameId -> 1, AreaCode -> 310, Phone -> 4103732, I
                                                  //| ncome -> 34000000)
  
 	println(hashMap1)                         //> Map(NameId -> 1, AreaCode -> 310, Phone -> 4103732, Income -> 34000000)

	for ( (k,v)<-hashMap1) println(k,v)       //> (NameId,1)
                                                  //| (AreaCode,310)
                                                  //| (Phone,4103732)
                                                  //| (Income,34000000)
                                                  
                                                 
	hashMap1 +=  (("Income2", 35000000),("NameId2", 2),("Phone2", 4133732), ("AreaCode2", 310))
                                                  //> res0: Scala_exercise.Exercise1_list_hash.hashMap1.type = Map(NameId -> 1, In
                                                  //| come2 -> 35000000, AreaCode -> 310, Phone -> 4103732, Phone2 -> 4133732, Inc
                                                  //| ome -> 34000000, AreaCode2 -> 310, NameId2 -> 2)
	
	for ( (k,v)<-hashMap1) println(k,v)       //> (NameId,1)
                                                  //| (Income2,35000000)
                                                  //| (AreaCode,310)
                                                  //| (Phone,4103732)
                                                  //| (Phone2,4133732)
                                                  //| (Income,34000000)
                                                  //| (AreaCode2,310)
                                                  //| (NameId2,2)
                                                  
 	val hashMap2: HashMap[String, Long] = HashMap(("Income3", 44000000),("NameId3", 3),("Phone3", 5533732), ("AreaCode3", 310))
                                                  //> hashMap2  : scala.collection.mutable.HashMap[String,Long] = Map(Income3 -> 4
                                                  //| 4000000, Phone3 -> 5533732, AreaCode3 -> 310, NameId3 -> 3)
	val keys =  ("Income3", "NameId", "Phone", "AreaCode")
                                                  //> keys  : (String, String, String, String) = (Income3,NameId,Phone,AreaCode)
	val variable = (44000000, 3, 5533732, 310)//> variable  : (Int, Int, Int, Int) = (44000000,3,5533732,310)
	val hashMap3 = hashMap2                   //> hashMap3  : scala.collection.mutable.HashMap[String,Long] = Map(Income3 -> 4
                                                  //| 4000000, Phone3 -> 5533732, AreaCode3 -> 310, NameId3 -> 3)
}
