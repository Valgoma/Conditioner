import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("INPUT.TXT"));
        int tr = sc.nextInt();
        int tc = sc.nextInt();
        String cond = sc.next();
        int temp = 0;
        switch (cond) {
            case "freeze":
                temp = tr;
                break;
            case "heat":
                temp = tc;
                break;
            case "auto":
                temp = tc;
                break;
            case "fan":
                temp = tr;
                break;
        }
     String s = String.valueOf(temp);
      Files.writeString(Path.of("OUTPUT.TXT"), s);
    }
}