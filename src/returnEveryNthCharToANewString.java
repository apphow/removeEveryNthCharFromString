public class returnEveryNthCharToANewString {

        public static void main(String[] args) {
            System.out.println(everyNth("Gregory", 2));
            System.out.println(everyNth("Cameron", 1));
            System.out.println(everyNth("Brittany", 4));
            System.out.println(everyNth("Chelsea", 3));
            System.out.println(everyNth("Samuel", 1));
            System.out.println(everyNth("Rylee", 2));
            System.out.println(everyNth("April", 6));

        }

        static String everyNth(String str, int n) {
            if ((n < 1) || (n>str.length())){
                System.out.println("Error.");
                System.exit(0);
            }
            String newStr = "";
            for (int i = 0; i < str.length(); i = i+n) {

                // 1st time through the loop, i will be equal to index 0
                // so first time through Gregory, i = G; G will be added to newStr.
                // 2nd time through the loop, i will be equal to i + n. (i = 0), and n = 2 (in Gregory); i + n = 0 + 2.
                // index at position 2 in Gregory is the letter e, so e is added to the "G" in newStr giving "Ge".
                // 3rd time through, i is now = to 2 (2nd index position), and n is 2, so i + n = 4.
                // Index 4 in Gregory contains o, So o is added to newStr giving "Geo".
                // 4th time through the loop, i is now = to 4. i + n  now is 4 + 2. 6th position in Gregory = y.
                // y will be added to newStr giving "Geoy".
                newStr += str.charAt(i);

            }
            return newStr;

        }
    }

