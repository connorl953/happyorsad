import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("happyorsad.txt"));
        if(!scanner.hasNext()){
            System.out.println("none");
            System.exit(0);
        }
        String happyorsad = scanner.nextLine();
        Pattern happy = Pattern.compile(":-\\)");
        Pattern sad = Pattern.compile(":-\\(");
        Matcher happys = happy.matcher(happyorsad);
        Matcher sads = sad.matcher(happyorsad);
        int happy_count = (int) happys.results().count();
        int sad_count = (int) sads.results().count();
        if(happy_count > sad_count){
            System.out.println("happy");
        }else if(happy_count < sad_count){
            System.out.println("sad");
        }else{
            System.out.println("unsure");
        }
    }
}
