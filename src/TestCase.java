/**
 * Created by Gleb on 29.05.2016.
 *
 * path = "D:\\Git\\Auto01\\test-cases.txt";
 * path = "D:\\Git\\Auto01\\empty.txt";
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestCase {
    String path = "";
    int lines;

    public String getPath() {
        return path;
    }

    public int getLines() {
        return lines;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public String [] getLines (String path, int count){
        try {
            String lines[] = new String[count];
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String row;

            for (int i=0; i<count; i++){
                row = bufferedReader.readLine();
                lines[i] = row;
            }
            fileReader.close();
            return lines;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String[0];
    }
}
