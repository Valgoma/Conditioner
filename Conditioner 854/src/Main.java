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
        if (cond.equals("freeze"))
        {
            if (tr<=tc)
            {
                temp = tr;}
            else
            {
                temp = tc;
            }
        }
        else if (cond.equals("heat"))
        {
            if (tr>=tc)
            {
                temp = tr;}
            else
            {
                temp = tc;
            }
        }
        else if (cond.equals("auto"))
        {
             temp = tc;
        }
        else if (cond.equals("fan"))
        {
             temp = tr;
        }
     String s = String.valueOf(temp);
      Files.writeString(Path.of("OUTPUT.TXT"), s);
    }
}
