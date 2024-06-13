package numberrangesummarizer;



import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 * Unit tests for NumberRangeSummarizer implementation.
 */
public class NumberRangeSummarizerTest {

    NumberRangeSummarizer summarizer = new NumberRangeSummarizerImplementation();

    @Test
    public void testCollect() {
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        List<Integer> expected = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
        assertEquals(expected, summarizer.collect(input));
    }

    @Test
    public void testSummarizeCollection() {
        List<Integer> input = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
        String expected = "1, 3, 6-8, 12-15, 21-24, 31";
        assertEquals(expected, summarizer.summarizeCollection(input));
    }

    @Test
    public void testSummarizeEmptyCollection() {
        List<Integer> input = Arrays.asList();
        String expected = "";
        assertEquals(expected, summarizer.summarizeCollection(input));
    }

    @Test
    public void testSummarizeSingleElement() {
        List<Integer> input = Arrays.asList(5);
        String expected = "5";
        assertEquals(expected, summarizer.summarizeCollection(input));
    }

    @Test
    public void testSummarizeNonSequential() {
        List<Integer> input = Arrays.asList(1, 4, 7);
        String expected = "1, 4, 7";
        assertEquals(expected, summarizer.summarizeCollection(input));
    }
}
