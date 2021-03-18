package codingBatChallenges;

public class StringChallenges {

  private static String helloName(String name) {
    /*
        Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        Example:
        helloName("Bob") → "Hello Bob!"
        helloName("Alice") → "Hello Alice!"
        helloName("X") → "Hello X!"
        */
    String result = "Hello " + name + "!";
    return result;
  }

  private static String makeAbba(String a, String b) {
    /*
        Given two strings, a and b, return the result of putting them together
        in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        Example:
        makeAbba("Hi", "Bye") → "HiByeByeHi"
        makeAbba("Yo", "Alice") → "YoAliceAliceYo"
        makeAbba("What", "Up") → "WhatUpUpWhat"
         */
    String result = a + b + b + a;
    return result;
  }

  private static String makeTags(String tag, String word) {
    /*
        The web is built with HTML strings like "<i>Yay</i>" which draws Yay
        as italic text. In this example, the "i" tag makes <i> and </i> which
        surround the word "Yay". Given tag and word strings, create the HTML
        string with tags around the word, e.g. "<i>Yay</i>".
        Example:
        makeTags("i", "Yay") → "<i>Yay</i>"
        makeTags("i", "Hello") → "<i>Hello</i>"
        makeTags("cite", "Yay") → "<cite>Yay</cite>"
        */
    String result = String.format("<%s>%s</%s>", tag, word, tag);
    return result;
  }

  private static String makeOutWord(String out, String word) {
    /*
        Given an "out" string length 4, such as "<<>>", and a word, return a
        new string where the word is in the middle of the out string, e.g. "<<word>>".
        Note: use str.substring(i, j) to extract the String starting at index i and going
        up to but not including index j.
        Example:
        makeOutWord("<<>>", "Yay") → "<<Yay>>"
        makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
        makeOutWord("[[]]", "word") → "[[word]]"
        */
    String result = out.substring(0, 2) + word + out.substring(2, 4);
    return result;

  }

  private static String extraEnd(String str) {
    /*
        Given a string, return a new string made of 3 copies of the
        last 2 chars of the original string. The string length will
        be at least 2.
        Example:
        extraEnd("Hello") → "lololo"
        extraEnd("ab") → "ababab"
        extraEnd("Hi") → "HiHiHi"
        */
    String resultPri = str.substring(str.length() - 2);
    String result = resultPri + resultPri + resultPri;
    return result;
  }

  private static String firstTwo(String str) {
    /*
        Given a string, return the string made of its first two chars,
        so the String "Hello" yields "He". If the string is shorter than
        length 2, return whatever there is, so "X" yields "X", and the
        empty string "" yields the empty string "". Note that str.length()
        returns the length of a string.
        Example:
        firstTwo("Hello") → "He"
        firstTwo("abcdefg") → "ab"
        firstTwo("ab") → "ab"*/
    String result;
    if (str.length() < 2) {
      result = str;
    } else {
      result = str.substring(0, 2);
    }
    return result;
  }

  private static String firstHalf(String str) {
    /*
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    Example:
    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
    */
    String result2;
    result2 = str.substring(0, (str.length() / 2));
    return result2;
  }

  private static String withoutEnd(String str) {
    /*
        Given a string, return a version without the first and last char,
        so "Hello" yields "ell". The string length will be at least 2.
        Example:
        withoutEnd("Hello") → "ell"
        withoutEnd("java") → "av"
        withoutEnd("coding") → "odin"
        */
    String result = str.substring(1, str.length() - 1);
    return result;
  }

  private static String comboString(String a, String b) {
    /*
        Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
        comboString("Hello", "hi") → "hiHellohi"
        comboString("hi", "Hello") → "hiHellohi"
        comboString("aaa", "b") → "baaab"
        */
    int aLength;
    int bLength;
    String result;

    if (a.length() < b.length()) {
      result = a + b + a;
    } else {
      result = b + a + b;
    }

    return result;
  }

  private static String nonStart(String a, String b) {
    /*
        Given 2 strings, return their concatenation, except omit
        the first char of each. The strings will be at least length 1.
        Example:
        nonStart("Hello", "There") → "ellohere"
        nonStart("java", "code") → "avaode"
        nonStart("shotl", "java") → "hotlava"
        */
    String result = a.substring(1, a.length()) + b.substring(1, b.length());
    return result;

  }

  private static String left2(String str) {
    /*
        Given a string, return a "rotated left 2" version where
        the first 2 chars are moved to the end. The string length
        will be at least 2.
        Example:
        left2("Hello") → "lloHe"
        left2("java") → "vaja"
        left2("Hi") → "Hi"
        */

    String result = str.substring(2, str.length()) + str.substring(0, 2);
    return result;
  }

  private static String right2(String str) {
    /*
        Given a string, return a "rotated right 2" version where the
        last 2 chars are moved to the start. The string length will
        be at least 2.
        Example:
        right2("Hello") → "loHel"
        right2("java") → "vaja"
        right2("Hi") → "Hi"
        */

    String result = str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
    return result;
  }

  private static String theEnd(String str, boolean front) {
    /*
        Given a string, return a string length 1 from its front,
        unless front is false, in which case return a string length
        1 from its back. The string will be non-empty.
        Example:
        theEnd("Hello", true) → "H"
        theEnd("Hello", false) → "o"
        theEnd("oh", true) → "o"
        */
    String result;
    if (front) {
      result = str.substring(0, 1);
    } else {
      result = str.substring(str.length() - 1);
    }
    return result;
  }

  private static String withouEnd2(String str) {
    /*
        Given a string, return a version without both the first
        and last char of the string. The string may be any length,
        including 0.
        Example:
        withouEnd2("Hello") → "ell"
        withouEnd2("abc") → "b"
        withouEnd2("ab") → ""
        */
    String result;
    if (str.length() < 2) {
      result = "";
    } else {
      result = str.substring(1, str.length() - 1);
    }

    return result;
  }

  private static String middleTwo(String str) {
    /*
        Given a string of even length, return a string made of the
        middle two chars, so the string "string" yields "ri". The
        string length will be at least 2.
        Example:
        middleTwo("string") → "ri"
        middleTwo("code") → "od"
        middleTwo("Practice") → "ct"
        */
    int res = ((str.length() - 2) / 2);
    String result = str.substring(res, str.length() - res);
    return result;
  }

  private static Boolean endsLy(String str) {

    if (str.length() < 2) {
      return false;
    } else {
      String result = str.substring(str.length() - 2);
      if (result.equals("ly")) {
        return true;
      } else {
        return false;
      }
    }
  }

  private static String nTwice(String str, int n) {
    /*
        Given a string and an int n, return a string made of
        the first and last n chars from the string. The string
        length will be at least n.
        Example:
        nTwice("Hello", 2) → "Helo"
        nTwice("Chocolate", 3) → "Choate"
        nTwice("Chocolate", 1) → "Ce"*/
    String result = str.substring(0, n) + str.substring(str.length() - n);
    return result;

  }

  private static String twoChar(String str, int index) {
    /*
        Given a string and an index, return a string length
        2 starting at the given index. If the index is too
        big or too small to define a string length 2, use the
        first 2 chars. The string length will be at least 2.
        Example:
        twoChar("java", 0) → "ja"
        twoChar("java", 2) → "va"
        twoChar("java", 3) → "ja"
        */
    String result;
    if (str.length() < index + 2 || index <= -1) {
      result = str.substring(0, 2);
    } else {
      result = str.substring(index, index + 2);
    }
    return result;
  }

  private static String middleThree(String str) {
    /*
        Given a string of odd length, return the string length 3 from
        its middle, so "Candy" yields "and". The string length will be
        at least 3.
        Example:
        middleThree("Candy") → "and"
        middleThree("and") → "and"
        middleThree("solving") → "lvi"
        */
    int strResult = ((str.length() - 3) / 2);
    String result = str.substring(strResult, str.length() - strResult);
    return result;
  }

  private static boolean hasBad(String str) {
    /*
        Given a string, return true if "bad" appears starting at index 0 or 1
        in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
        The string may be any length, including 0.
        Note: use .equals() to compare 2 strings.
        Example:
        hasBad("badxx") → true
        hasBad("xbadxx") → true
        hasBad("xxbadxx") → false
        */
    if (str.length() <= 3 && !str.equals("bad")) {
      return false;
    } else if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
      return true;
    } else {
      return false;
    }

  }

  private static String atFirst(String str) {
    /*
        Given a string, return a string length 2 made of its first
        2 chars. If the string length is less than 2, use '@' for
        the missing chars.
        Example:
        atFirst("hello") → "he"
        atFirst("hi") → "hi"
        atFirst("h") → "h@"*/
    String result;
    if (str.length() < 1) {
      result = str.substring(0, str.length()) + "@" + "@";
    } else if (str.length() < 2) {
      result = str.substring(0, str.length()) + "@";
    } else {
      result = str.substring(0, 2);
    }

    return result;
  }

  private static String lastChars(String a, String b) {
    /*
          Given 2 strings, a and b, return a new string made of the first
          char of a and the last char of b, so "yo" and "java" yields "ya".
          If either string is length 0, use '@' for its missing char.
          Example:
          lastChars("last", "chars") → "ls"
          lastChars("yo", "java") → "ya"
          lastChars("hi", "") → "h@"
          */
    if (a.length() < 1) {
      a = "@@";
    }
    if (b.length() < 1) {
      b = "@@";
    }
    return a.substring(0, 1) + b.substring(b.length() - 1);
  }

  private static String conCat(String a, String b) {
    /*
        Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
        Example:
        conCat("abc", "cat") → "abcat"
        conCat("dog", "cat") → "dogcat"
        conCat("abc", "") → "abc"
        */

    if (a.length() < 1 || b.length() < 1) {
      return a + b;
    } else if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
      String result = (a.substring(0, a.length() - 1) + b);
      return result;
    } else {
      return a + b;
    }
  }

  private static String lastTwo(String str) {
    /*
      Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
      Example:
      lastTwo("coding") → "codign"
      lastTwo("cat") → "cta"
      lastTwo("ab") → "ba"
      */

    if (str.length() < 2) {
      return str;
    } else {
      StringBuilder reverse = new StringBuilder(str.substring(str.length() - 2)).reverse();
      String resultReverse = reverse.toString();
      String result = (str.substring(0, str.length() - 2) + resultReverse);

      return result;

    }


  }


  public static void main(String[] args) {
    /*
     *
     *
     * USE O METODO COM OS VALORES AQUI
     *
     *
     */
  }


}
