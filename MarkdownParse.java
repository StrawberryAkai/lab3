import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        BufferedReader br = new BufferedReader(new FileReader(markdown));

        ArrayList<String> toReturn = new ArrayList<>();
        String text = "";
        String line;      
        while((line = br.readLine())!= null){
            if(!line.isEmpty()){
                text += line;
                if(line != null){
                    text += "\n";
                }
            }
        }
        br.close();

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
	    System.out.println(getLinks("test-file.md"));
    }
}

