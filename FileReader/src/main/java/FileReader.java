import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\husna\\OneDrive\\Desktop\\lorem.txt");
        Scanner scanner = new Scanner(fis);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
