import org.w3c.dom.stylesheets.StyleSheetList;

public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
   //  In the detectAndPrint(String[], String[]) method: When comparing two strings (in this
   //particular application), compare their lowercase versions. This will make sure that, for example,
   //the string “RUNI” will match the string “Runi”.

    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code

        //first changing everything to lowercaps

        for (int i = 0; i<sentences.length; i++){
            sentences[0].toLowerCase();
        }

        for (int i = 0; i<keywords.length; i++){
            keywords[0].toLowerCase();
        }

        //nested loop the points at a word in keyword and then checks if its in a sentence
        for (int j = 0; j< sentences.length; j++) {
            for (int i = 0; i < keywords.length; i++){
                if (contains(sentences[j], keywords[i]) == true ){
                    System.out.println(sentences[j]);
                    break;
                }
            }
        }

    }

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
