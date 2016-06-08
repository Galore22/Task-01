package com.company;

/*

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        String ip_pattern = "^(http)s?:\\/\\/[^\\.-][\\da-zA-Z\\.-]*[^\\.-]\\.([a-z]{1,6})\\/?$";

        String inputFile = "Input_File.txt";   // name of input file

        regex_match (inputFile, ip_pattern);

    }

    public static void regex_match (String inputFile, String ip_pattern){

        // Read IPs from an input file
        ArrayList<String> ip_array = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int index=0;
            while ((line = bufferedReader.readLine()) != null) {
                ip_array.add(index, line);
                index++;
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Use regular expression and Write result to the txt file
        Pattern pattern = Pattern.compile(ip_pattern);
        String outputFile = inputFile.substring(0, inputFile.length()-4) + "_result.txt";
        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < ip_array.size(); i++){

                Matcher regexMatcher = pattern.matcher (ip_array.get(i));

                bufferedWriter.write(ip_array.get(i));
                if (regexMatcher.matches()){
                    bufferedWriter.write("\tmatch");
                }
                else {
                    bufferedWriter.write("\tnot match");
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }

    }
}
