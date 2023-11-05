/*
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

  Example: (Input --> Output)

  "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

  isIsogram "Dermatoglyphics" = true
  isIsogram "moose" = false
  isIsogram "aba" = false

  Example similar

  class isogram {
    public static boolean isIsogram(String str) {
        return str.toLowerCase()
                  .chars()
                  .distinct()
                  .count() == str.length();
    }
  }
 */

public class isogram {
  public static boolean isIsogram(String str) {
    boolean isIsogram = true;
    if (str == "") {
      return isIsogram;
    }

    for (char ch : str.toCharArray()) {
      Character newch = Character.toLowerCase(ch);
      int count = 0;

      for (char cht : str.toCharArray()) {
        Character newcht = Character.toLowerCase(cht);

        if (newcht.equals(newch)) {
          ++count;
        }

        if (count > 1) {
          isIsogram = false;
          return isIsogram;
        }
      }
    }

    return isIsogram;
  }
}