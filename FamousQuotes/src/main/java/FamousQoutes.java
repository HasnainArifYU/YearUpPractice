import java.util.Scanner;

public class FamousQoutes {
    public static void main(String[] args) {

        try {
            String[] Quotes = {
                    "The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela",
                    "The way to get started is to quit talking and begin doing. -Walt Disney",
                    "Your time is limited, so don't waste it living someone else's life. -Steve Jobs",
                    "If life were predictable it would cease to be life, and be without flavor. -Eleanor Roosevelt",
                    "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough. -Oprah Winfrey",
                    "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success. -James Cameron",
                    "Life is what happens when you're busy making other plans. -John Lennon",
                    "Spread love everywhere you go. Let no one ever come to you without leaving happier. -Mother Teresa",
                    "When you reach the end of your rope, tie a knot in it and hang on. -Franklin D. Roosevelt",
                    "Always remember that you are absolutely unique. Just like everyone else. -Margaret Mead"
            };
            System.out.println("Please enter a number from 1 to 10 to get a famous quote: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            //int random = (int) (Math.random() * Quotes.length);
            System.out.println(Quotes[number]);
        } catch (Exception e) {
            System.out.println("Please enter a valid number from 1 to 10");
        }
    }
}
