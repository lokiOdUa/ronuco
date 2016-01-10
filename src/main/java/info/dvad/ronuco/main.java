package info.dvad.ronuco;

/**
 * Created by loki.od.ua on 10.01.2016.
 */
public class main {
    public static void main(String[] args) {
        // Check arguments number and show help message if needed
        if (args.length == 0) {
            System.err.println("ERROR: First argument must be value to convert");
            System.exit(-1);
        }
        // Check if first argument is an valid Roman value
        if (checkRoman(args[0]) !=0 ){
            System.err.println("ERROR: Value given is not an valid Roman Numeral");
            System.exit(-1);
        }
        // Convert value from Roman to Arabic
        System.out.println("Converting value " + args[0] + ": got " + toNumber(args[0]));
    }

    public static int toNumber(String roman) {
        if (roman.equals("")) return 0;
        if (roman.startsWith("M"))
            return 1000 + toNumber(roman.substring(1, roman.length()));
        else if (roman.startsWith("CM"))
            return 900 + toNumber(roman.substring(2, roman.length()));
        else if (roman.startsWith("D"))
            return 500 + toNumber(roman.substring(1, roman.length()));
        else if (roman.startsWith("CD"))
            return 400 + toNumber(roman.substring(2, roman.length()));
        else if (roman.startsWith("C"))
            return 100 + toNumber(roman.substring(1, roman.length()));
        else if (roman.startsWith("XC"))
            return 90 + toNumber(roman.substring(2, roman.length()));
        else if (roman.startsWith("L"))
            return 50 + toNumber(roman.substring(1, roman.length()));
        else if (roman.startsWith("XL"))
            return 40 + toNumber(roman.substring(2, roman.length()));
        else if (roman.startsWith("X"))
            return 10 + toNumber(roman.substring(1, roman.length()));
        else if (roman.startsWith("IX"))
            return 9 + toNumber(roman.substring(2, roman.length()));
        else if (roman.startsWith("V"))
            return 5 + toNumber(roman.substring(1, roman.length()));
        else if (roman.startsWith("IV"))
            return 4 + toNumber(roman.substring(2, roman.length()));
        else if (roman.startsWith("I"))
            return 1 + toNumber(roman.substring(1, roman.length()));
            return 0;
    }

    public static int checkRoman(String value){
        /* Regexp found at StackOverflow
        http://stackoverflow.com/questions/267399/how-do-you-match-only-valid-roman-numerals-with-a-regular-expression
        * */
        if (value.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
            return 0;
        return -1;
    }
}
