public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
        System.out.println(contains("baba yaga", "babayaga"));
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        return str.toLowerCase();
    }


    //In the contains(String, String) method: Using break may simplify your code.
    /** If str1 contains str2, returns true; otherwise returns false. */
   /** If str1 contains str2, returns true; otherwise returns false. */
   public static boolean contains(String str1, String str2) {
    // Make sure str2 is not longer than str1
    if (str1.length() < str2.length()) {
        return false;
    }
    if (str2 == ""){
        return true;
    }

    // go over str1 and check if a substring matches str2
    for (int i = 0; i <= str1.length() - str2.length(); i++) {
        // Check if substring of str1 starting at i matches str2
        boolean issub = true;
        for (int j = 0; j < str2.length(); j++) {
            if (str1.charAt(i + j) != str2.charAt(j)) {
                issub = false;
                break;
            }
        }
        // If match found, return true
        if (issub == true) {
            return true;
        }
    }

    // No match found, return false
    return false;

    }
}
   // boolean test1 = MyString.contains("baba yaga", "baba");
  //  boolean test2 = MyString.contains("baba yaga", "");
  //  boolean test3 = !MyString.contains("baba yaga", "John Wick is the baba yaga");
   // boolean test4 = !MyString.contains("baba yaga", "Yaga");
   // boolean test5 = !MyString.contains("baba yaga", "babayaga");

 



