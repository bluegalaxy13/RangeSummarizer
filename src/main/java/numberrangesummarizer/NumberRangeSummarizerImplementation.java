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
        return Arrays.stream(input.split(","))
                     .map(Integer::parseInt)
                     .sorted()
                     .collect(Collectors.toList());
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) 
    {
        if (input == null || input.isEmpty()) 
        {
            return "";
        }

        List<Integer> numbers = new ArrayList<>(input);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) 
        {
            int start = numbers.get(i);

            // Check if it's a sequence
            while (i + 1 < numbers.size() && numbers.get(i + 1) == numbers.get(i) + 1) 
            {
                i++;
            }

            int end = numbers.get(i);

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
