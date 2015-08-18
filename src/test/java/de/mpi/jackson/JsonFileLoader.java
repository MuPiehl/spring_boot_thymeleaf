package de.mpi.jackson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by matthiaspiehl on 30.05.15.
 */
public class JsonFileLoader {
    protected static String loadFromResourceFile(String fileName) {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(fileName);
        //InputStream inputStream = ClassLoader.getSystemClassLoader().getSystemResourceAsStream("/test/resources/example.json");

        try {
            if (is != null && is.available() > 0) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
                String line = null;
                StringBuffer buffer = new StringBuffer();

                while ((line = bufferedReader.readLine()) != null)
                    buffer.append(line);


                return buffer.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getExampleJson() {
        return loadFromResourceFile("example.json");
    }
    public static String getJson() {
        return loadFromResourceFile("example.json");
    }
}
