package RecursionReverse;

public class Reverse {
   public static String Reverse(String str) {
       if (str.length() == 0)
           return str.toString();

       return (str.charAt(str.length()-1)+Reverse(str.substring(0,str.length()-1)));
   }

   public static void main(String[] args) {
       System.out.println(Reverse("hello world"));
   }
}
