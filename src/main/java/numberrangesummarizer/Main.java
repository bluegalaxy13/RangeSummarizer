package numberrangesummarizer;

import java.util.Collection;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a comma-separated list of numbers:");
            String input = scanner.nextLine();
            
            NumberRangeSummarizer summarizer = new NumberRangeSummarizerImplementation();
            Collection<Integer> collectedNumbers = summarizer.collect(input);
            String result = summarizer.summarizeCollection(collectedNumbers);
            
            System.out.println("Summarized Range: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Input must be a list of Integers Delimited by a comma..." );
        }
    }
}
