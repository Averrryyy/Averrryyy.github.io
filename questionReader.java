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
                int blankCountOffset = 0;
                for(int i = 0; i < items.length; i ++){
                    if(items[i].toString().isEmpty()){
                        blankCountOffset++;
                    }else{
                        System.out.println("<li> <input type=\"checkbox\" id=\""+ (i+1 - blankCountOffset) + "\"> <label for=\""+ (i+1 - blankCountOffset) +"\">" + items[i]  + "</label> </li>");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        
    }
}