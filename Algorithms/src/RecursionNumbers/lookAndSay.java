package RecursionNumbers;

public class lookAndSay {
    public static String lookAndSay(String num, int iterations) {
        if (num.length() == iterations)
            return String.valueOf(num.length()) + num.charAt(0);

        final char firstChar = num.charAt(0);

        if (firstChar == num.charAt(iterations))
            return lookAndSay(num, iterations + 1);
        else
            return String.valueOf(num.substring(0, iterations).length()) + firstChar + lookAndSay(num.substring(iterations), 0);
    }

    public static String lookAndSay(int numOfTimes, String number) {
        if (0 >= numOfTimes)
            return "";
        else
            return number + " " + lookAndSay(numOfTimes - 1, lookAndSay(number, 0));
    }


    public static void main(String[] args) {
        System.out.println(lookAndSay(10, "1"));
    }
}
