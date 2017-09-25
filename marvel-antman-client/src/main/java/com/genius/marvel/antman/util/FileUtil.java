package com.genius.marvel.antman.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Chuck Liu
 * @date 9/22/17
 * @time 4:51 PM
 */
public class FileUtil {

    public static Properties loadProperties(String filePath) {
        Properties props = new Properties();
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(filePath);
            props.load(inputStream);
        } catch (FileNotFoundException fnfEx) {
            fnfEx.printStackTrace();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ioEx) {
                    ioEx.printStackTrace();
                }
            }
        }

        return props;
    }
}
