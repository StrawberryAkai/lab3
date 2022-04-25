import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

        BufferedReader br = new BufferedReader(new FileReader(markdown));
        List<String> storetext = new ArrayList<>();
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
        storetext.add(text);
        for(String x : storetext){
            if(x.contains("[")) {
        		if(x.contains("]")) {
        			if(x.contains("(")) {
        				if(x.contains(")")) {
        					int openParen = x.indexOf("(");
        					int closeParen = x.indexOf(")");
        					toReturn.add(x.substring(openParen + 1, closeParen));
        				}
        			}continue;
        		}continue;
        	}continue;
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
	    System.out.println(getLinks("test-file.md"));
    }
}
