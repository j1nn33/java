package task5_input;
import java.io.*;
import java.util.*;

public class task5_input {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String phrase = bufferedReader.readLine();

        System.out.println(phrase);
    }
}


