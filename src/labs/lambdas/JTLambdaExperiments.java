package labs.lambdas;

import java.util.function.Predicate;
import labs.lambdas.Person;
import java.util.function.Function;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * JTLambdaExperiments.java
 *
 * A variety of experiments for working with lambdas, based on the
 * Java Tutorial on lambda expressions, available at 
 * https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class JTLambdaExperiments {

  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Run our experiments.
   */
  public static void main(String[] args) {
    List<Person> roster = new ArrayList<>();
         roster.add(
             new Person(
             "Fred",
             IsoChronology.INSTANCE.date(1980, 6, 20),
             Person.Sex.MALE,
             "fred@example.com"));
         roster.add(
             new Person(
             "Jane",
             IsoChronology.INSTANCE.date(1990, 7, 15),
             Person.Sex.FEMALE, "jane@example.com"));
         roster.add(
             new Person(
             "George",
             IsoChronology.INSTANCE.date(1991, 8, 13),
             Person.Sex.MALE, "george@example.com"));
         roster.add(
             new Person(
             "Bob",
             IsoChronology.INSTANCE.date(2000, 9, 12),
             Person.Sex.MALE, "bob@example.com"));

    printPersonsOlderThan(roster, 100);
    printPersonsWithinAgeRange(roster, 5, 16);
    // printPersons(roster, );
  } // main(String[])

  // +--------------------------------+------------------------------
  // | Methods from the Java Tutorial |
  // +--------------------------------+

  public static void printPersonsOlderThan(List<Person> roster, int age) {
    for (Person p : roster) {
        if (p.getAge() >= age) {
            p.printPerson();
        }
    }
}

public static void printPersonsWithinAgeRange(
    List<Person> roster, int low, int high) {
    for (Person p : roster) {
        if (low <= p.getAge() && p.getAge() < high) {
            p.printPerson();
        }
    }
}

public static void printPersons(
    List<Person> roster, CheckPerson tester) {
    for (Person p : roster) {
        if (tester.test(p)) {
            p.printPerson();
        }
    }
}

// printPersons(
//     roster,
//     new CheckPerson() {
//         public boolean test(Person p) {
//             return p.getGender() == Person.Sex.MALE
//                 && p.getAge() >= 18
//                 && p.getAge() <= 25;
//         }
//     }
// )

// printPersons(
//     roster,
//     (Person p) -> p.getGender() == Person.Sex.MALE
//         && p.getAge() >= 18
//         && p.getAge() <= 25
// );

} // class JTLambdaExperiments
