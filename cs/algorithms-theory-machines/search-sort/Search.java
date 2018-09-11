import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
* Time complexity: Linear 2^1
* 
* // 2.3 GHz Intel Core i5
* 
* ➜ java Search 1k-10-keywords.txt 1b-10.txt
* 4 seconds.
* ➜ java Search 1k-10-keywords.txt 2b-10.txt
* 9 seconds.
* ➜ java Search 1k-10-keywords.txt 4b-10.txt
* 21 seconds.
* 
* 
**/
class Search {
    public static int searchString(String keyword, String[] list) {
        for (int i = 0; i < list.length ; i++) {
            if (list[i].compareTo(keyword) == 0) return i;
        }

        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException , IOException{
        String keywordFile = args[0];
        String wordListFile = args[1];
        String[] list = readLines(wordListFile);
        String[] keywords = readLines(keywordFile);


        double start = System.currentTimeMillis() / 1000.0;
        for (int i = 0; i < keywords.length ; i++) {
            int hit = searchString(keywords[i], list);
        }

        double end = System.currentTimeMillis() / 1000.0;
        System.out.println(Math.round(end - start) + " seconds.");
    }

    public static String[] readLines(String fileName) throws FileNotFoundException, IOException {
        List<String> lines = new ArrayList<String>();

        File file = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String singleLine;


        while((singleLine = bufferedReader.readLine()) != null) {
            lines.add(singleLine);
        }

        return lines.toArray(new String[0]);
    }
}
