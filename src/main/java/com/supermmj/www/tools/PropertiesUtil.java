package com.supermmj.www.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*******************************************************************************
 * Copyright (c) 2016 supermmj.com
 * <p>
 * All rights reserved.
 * <p>
 * Contributors:
 * Miller Ming - Initial implementation
 *******************************************************************************/
public class PropertiesUtil {
    public static Properties loadProperties(String filePath){
        Properties propertie = new Properties();
        InputStream stream;
        stream =PropertiesUtil.class.getClassLoader().getResourceAsStream(filePath);
        if(stream == null){
            System.out.println("Error: filePath is not exist ");
            return null;
        }else{
            try {
                propertie.load(stream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return propertie;
    }

}
