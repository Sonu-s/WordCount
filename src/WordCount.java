import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String []args)throws Exception{
        File file=new File("Text.txt");
        Scanner in = new Scanner(file);
        int word=0;
        while(in.hasNextLine()){
            String line=in.nextLine();
            word+=line.split(" ").length;

        }
        System.out.println("Number of words : "+word+" words");
    }
}
