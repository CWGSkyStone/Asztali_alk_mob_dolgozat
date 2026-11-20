/*
* File: Config.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II-N
* Date: 2026-11-20
* Github: https://github.com/CWGSkyStone213/
* Licenc: MIT
*/

package dev.skystone;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config extends Properties {
    private final String file_name = "config.properties";

    public Config(){
        init();
    }
    
    private void init(){
        try {
            tryInit();
        } catch (IOException e) {
            e.getMessage();
        }
    }
    
    private void tryInit() throws IOException{
        InputStream input_stream = new FileInputStream(file_name);
        load(input_stream);
    }
}
