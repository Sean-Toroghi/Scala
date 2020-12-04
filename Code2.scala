
object Code2_prime extends App {
  
  def divide_check(n:Int) : List[Int] = 
    for (i <- List.range(1,n+1)  if n % i == 0) 
      yield i
  
    def check_prime(n:Int) = 
      divide_check(n).length == 2
    
    if (check_prime(23)) 
      println ("it is a prime number") 
    else
      println("it i NOT a prime number")
  
  
}