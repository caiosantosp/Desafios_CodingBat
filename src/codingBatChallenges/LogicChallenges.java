package codingBatChallenges;

public class LogicChallenges {

  static boolean cigarParty(int cigars, boolean isWeekend) {
    /*
      When squirrels get together for a party, they like
      to have cigars. A squirrel party is successful when
      the number of cigars is between 40 and 60, inclusive.
      Unless it is the weekend, in which case there is no
      upper bound on the number of cigars. Return true if
      the party with the given values is successful, or false
      otherwise.
      Example:
      cigarParty(30, false) → false
      cigarParty(50, false) → true
      cigarParty(70, true) → true
      */


    if (isWeekend) { // se final de semana
      if (cigars >= 40) {
        return true;
      }
    }
    if (cigars >= 40 && cigars <= 60) {
      return true;
    } else {
      return false;
    }

  }

  static int dateFashion(int you, int date) {
    /*
      You and your date are trying to get a table at a restaurant. The parameter
      "you" is the stylishness of your clothes, in the range 0..10, and "date" is
      the stylishness of your date's clothes. The result getting the table is encoded
      as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8
      or more, then the result is 2 (yes). With the exception that if either of you
      has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
      Example:
      dateFashion(5, 10) → 2
      dateFashion(5, 2) → 0
      dateFashion(5, 5) → 1
      */

    /* Se algum de vocês for muito estiloso, 8 ou mais, o resultado é 2 (sim).
         Com a exceção de que se algum de vocês tiver estilo 2 ou menos, o resultado será 0 (não).
         Caso contrário, o resultado é 1 (talvez).
      */

    if (date <= 2 || you <= 2) {
      return 0;
    } else if (date >= 8 || you >= 8) {
      return 2;
    } else {
      return 1;
    }
  }

  static boolean squirrelPlay(int temp, boolean isSummer) {
    /*
      The squirrels in Palo Alto spend most of the day playing. In particular,
      they play if the temperature is between 60 and 90 (inclusive). Unless it
      is summer, then the upper limit is 100 instead of 90. Given an int temperature
      and a boolean isSummer, return true if the squirrels play and false otherwise.
      Example:
      squirrelPlay(70, false) → true
      squirrelPlay(95, false) → false
      squirrelPlay(95, true) → true
      */
    if (isSummer && temp >= 60 && temp <= 100 || temp >= 60 && temp <= 90) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(squirrelPlay(70, false));
    System.out.println(squirrelPlay(95, false));
    System.out.println(squirrelPlay(95, true));

  }
}
