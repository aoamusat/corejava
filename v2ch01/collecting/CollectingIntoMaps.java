package collecting;

import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 * @version 1.02 2023-10-19
 * @author Cay Horstmann
 */
public class CollectingIntoMaps
{

   public record Person(int id, String name) {}

   public static Stream<Person> people()
   {
      return Stream.of(new Person(1001, "Peter"), new Person(1002, "Paul"),
         new Person(1003, "Mary"));
   }

   public static void main(String[] args) throws IOException
   {
      Map<Integer, String> idToName = people().collect(
         Collectors.toMap(Person::id, Person::name));
      System.out.println("idToName: " + idToName);

      Map<Integer, Person> idToPerson = people().collect(
         Collectors.toMap(Person::id, Function.identity()));
      System.out.println("idToPerson: " + idToPerson.getClass().getName()
         + idToPerson);

      idToPerson = people().collect(
         Collectors.toMap(Person::id, Function.identity(), 
            (existingValue, newValue) -> { throw new IllegalStateException(); }, 
            TreeMap::new));
      System.out.println("idToPerson: " + idToPerson.getClass().getName()
         + idToPerson);

      Map<String, String> languageNames = Locale.availableLocales().collect(
         Collectors.toMap(
            Locale::getDisplayLanguage, 
            l -> l.getDisplayLanguage(l), 
            (existingValue, newValue) -> existingValue));
      System.out.println("languageNames: " + languageNames);

      Map<String, Set<String>> countryLanguageSets = Locale.availableLocales().collect(
         Collectors.toMap(
            Locale::getDisplayCountry,
            l -> Set.of(l.getDisplayLanguage()),
            (a, b) -> 
            { // union of a and b
               Set<String> union = new HashSet<>(a);
               union.addAll(b);
               return union;
            }));
      System.out.println("countryLanguageSets: " + countryLanguageSets);
   }
}
