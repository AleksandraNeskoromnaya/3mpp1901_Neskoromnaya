public class Palindrome
{
  public static void main(String[] args)
  {
    for (int i = 0; i < args.length; i++)
    {
      String s = args[i];
      System.out.println("Is a word '" + args[i] + "' palindrome? - " + isPalindrome(args[i]));
    }
  }
  //переписываем слово наоборот с последней буквы
  public static String reverseString(String s)
  {
    String rev = "";
    for(int i = s.length() - 1; i >= 0; i--)
      rev += s.charAt(i);
    return rev;
  }
  // возвращает true, если слово - палиндром
  public static boolean isPalindrome(String s)
  {
    String revS = reverseString(s);
    return s.equals(revS);
  }
}

