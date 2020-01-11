public class Primes
{
  public static void main(String[] args)
  {
    for(int i = 2; i <= 100; i++)
    {
      if(isPrime(i))
        System.out.println(i);     //вывод простых чисел
    }
  }
  //проверка простое ли число n
   public static boolean isPrime(int n)
  {
     for(int a = 2; a < n; a++)
     {
       if(n % a == 0)
         return false;
     }
     return true;
  }
}

