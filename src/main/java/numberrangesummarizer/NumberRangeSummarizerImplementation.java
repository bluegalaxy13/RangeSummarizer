package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class NumberRangeSummarizerImplementation implements NumberRangeSummarizer 
{

     @Override
    public Collection<Integer> collect(String input) 
    {
        return Arrays.stream(input.split(","))//splits the input string by commas, creating an array of strings
                     .map(Integer::parseInt)//converts each string to an integer
                     .sorted()//sorts integers in ascending order
                     .collect(Collectors.toList());//collects the sorted integers into a list and returns it.
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) 
    {
        if (input == null || input.isEmpty()) //handle empty input
        {
            return "";
        }

        List<Integer> numbers = new ArrayList<>(input); //create new 'ArrayList' from the input collection to allow indexed access
        StringBuilder result = new StringBuilder(); //build output of string efficiently

        for (int i = 0; i < numbers.size(); i++) 
        {
            int start = numbers.get(i); //start range

            // Check if it's a sequence
            while (i + 1 < numbers.size() && numbers.get(i + 1) == numbers.get(i) + 1) 
            {
                i++;
            }

            int end = numbers.get(i); //end range

            if (start == end) 
            {
                result.append(start).append(", ");
            } else 
            {
                result.append(start).append("-").append(end).append(", ");
            }
        }

        // Remove trailing comma and space
        if (result.length() > 0) 
        {
            result.setLength(result.length() - 2);
        }

        return result.toString();
        
    }
}
