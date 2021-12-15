package org.demo.baseclass;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.UUID;

public class BaseClass{

    public static RequestSpecification httpRequest;
    public static Response httpResponse;
    public static Properties properties;
    public static String uuid;

    public BaseClass(){
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream(new File("src/test/resources/testdata.properties"));
            properties.load(fis);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getUUID(){
        return UUID.randomUUID().toString();
    }
}
