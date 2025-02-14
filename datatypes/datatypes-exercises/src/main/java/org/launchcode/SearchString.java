import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a term to search for in the sentence: ");
        String searchTerm = scanner.nextLine().toLowerCase();

        if (aliceSentence.toLowerCase().contains(searchTerm)) {
            int index = aliceSentence.toLowerCase().indexOf(searchTerm);
            int length = searchTerm.length();

            System.out.println("Index of the word '" + searchTerm + "' in the sentence: " + index);
            System.out.println("Length of the word '" + searchTerm + "': " + length);

            // Remove the word from the sentence
            String updatedSentence = aliceSentence.replaceAll("(?i)" + searchTerm, "");
            System.out.println("Updated sentence after removing the word:");
            System.out.println(updatedSentence);
        } else {
            System.out.println("The search term was not found in the sentence.");
        }

        scanner.close();
    }
}
