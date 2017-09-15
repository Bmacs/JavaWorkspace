package RecursionReverse;

public class Reverse {
   public static String Reverse(String str) {
       if (str.length() == 0)
           return str.toString();


       String finalString = "";
       for (int i = 0; i < str.length()-1; i++)
           finalString += str.charAt(i);

      // return (str.charAt(str.length()-1)+Reverse(str.substring(0,str.length()-1)));\
       return (str.charAt(str.length()-1)+Reverse(finalString));
   }

   public static void main(String[] args) {
       System.out.println(Reverse("hello world"));
   }
}
