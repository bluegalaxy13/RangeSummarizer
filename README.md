# Number Range Summarizer

## Description

This project implements the `NumberRangeSummarizer` interface to produce a comma-delimited list of numbers, grouping the numbers into a range when they are sequential.

## Requirements

- Java 8 or later
- Maven for build automation

## Usage

1. Clone the repository.
2. Install Maven: `mvn -v`
3. Build the project using Maven: `mvn clean compile`.
4. Run the tests using Maven: `mvn test`.
5. Use Maven to run the 'Main' Class: `mvn exec:java -Dexec.mainClass="numberrangesummarizer.Main"`

Alternatively, you can manually compile and run the Java files:

1. Clone the repository.
2. Navigate to the source directory: `cd src/main/java`
3. Compile the Java files: `javac numberrangesummarizer/*.java`
4. Run the Main class: `java numberrangesummarizer.Main`

## Implementation

The `NumberRangeSummarizerImplementation` class implements the `NumberRangeSummarizer` interface with the following methods:

- `Collection<Integer> collect(String input)`: Collects the input string of comma-separated numbers into a sorted collection of integers.
- `String summarizeCollection(Collection<Integer> input)`: Produces a summarized string of numbers, grouping them into ranges when they are sequential.

## Unit Tests

The `NumberRangeSummarizerTest` class contains unit tests to validate the functionality of the `NumberRangeSummarizerImplementation` class.

## Example

Input: `"1,3,6,7,8,12,13,14,15,21,22,23,24,31"`
Output: `"1, 3, 6-8, 12-15, 21-24, 31"`

## Author
Ricardo Steven Sass
