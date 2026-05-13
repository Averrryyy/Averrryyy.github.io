import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        String filename = "questions.txt";
            try{
                Stream<String> s = Files.lines(Paths.get(filename));
                Object[] items = s.toArray();
                for(int i = 0; i < items.length; i ++){
                    System.out.println("<li> <input type=\"checkbox\" id=\""+ (i+1) + "\"> <label for=\""+ (i+1) +"\">" + items[i]  + "</label> </li>");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        
    }
}