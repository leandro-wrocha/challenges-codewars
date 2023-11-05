/*
  The goal of this exercise is to convert a string to a new string where each character in 
  the new string is "(" if that character appears only once in the original string, or ")" if that character 
  appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

  Examples: 
  "din"      =>  "((("
  "recede"   =>  "()()()"
  "Success"  =>  ")())())"
  "(( @"     =>  "))(("

  Notes:
  Assertion messages may be unclear about what they display in some languages. 
  If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
*/

public class DuplicateEncoder {
  static String encode(String word) {
    String newWord = "";

    for (Character ch : word.toCharArray()) {
      Character newCh = Character.toLowerCase(ch);
      boolean encoder = false;
      int count = 0;

      for (Character cht : word.toCharArray()) {
        Character newCht = Character.toLowerCase(cht);

        if (newCht.equals(newCh)) {
          ++count;
        }

        if (count >= 2) {
          encoder = true;
        }
      }

      newWord = newWord + (encoder ? ")" : "(");
    }

    return newWord;
  }
}
