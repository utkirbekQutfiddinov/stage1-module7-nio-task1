package com.epam.mjc.nio;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        try (BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
            String nameLine=br.readLine();
            String ageLine=br.readLine();
            String emailLine=br.readLine();
            String phoneLine=br.readLine();

            return new Profile(nameLine.substring(nameLine.indexOf(" ")+1),
                                        Integer.parseInt(ageLine.substring(ageLine.indexOf(" ")+1)),
                                        emailLine.substring(emailLine.indexOf(" ")+1),
                                        Long.parseLong(phoneLine.substring(phoneLine.indexOf(" ")+1)));

        } catch (IOException fnfe){
            fnfe.printStackTrace();
        }
        return null;
    }
}
