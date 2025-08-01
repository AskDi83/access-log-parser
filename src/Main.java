import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        boolean fileExists;
        boolean isDirectory;
        while (1 < 3) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            fileExists = file.exists();
            isDirectory = file.isDirectory();
            if (fileExists && !isDirectory) {
                System.out.println("Путь указан верно");
                count++;
                System.out.println("Это файл N " + count);
            } else {
                if (isDirectory) System.out.println("Это не файл, а директория");
                else System.out.println("Этот файл не существует");
                continue;
            }
        }
    }
}