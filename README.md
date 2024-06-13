# Number Range Summarizer

## Description

This project implements the `NumberRangeSummarizer` interface to produce a comma-delimited list of numbers, grouping the numbers into a range when they are sequential.

## Requirements

- Java 8 or later
- Maven for build automation

## Project Structure


## Usage

1. Clone the repository.
2. Build the project using Maven: `mvn clean install`.
3. Run the tests using Maven: `mvn test`.

## Implementation

The `NumberRangeSummarizerImpl` class implements the `NumberRangeSummarizer` interface with the following methods:

- `Collection<Integer> collect(String input)`: Collects the input string of comma-separated numbers into a sorted collection of integers.
- `String summarizeCollection(Collection<Integer> input)`: Produces a summarized string of numbers, grouping them into ranges when they are sequential.

## Unit Tests

The `NumberRangeSummarizerTest` class contains unit tests to validate the functionality of the `NumberRangeSummarizerImpl` class.

## Example

Input: `"1,3,6,7,8,12,13,14,15,21,22,23,24,31"`
Output: `"1, 3, 6-8, 12-15, 21-24, 31"`

## License

This project is licensed under the MIT License.