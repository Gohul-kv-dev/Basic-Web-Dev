package com.xmltojson;

import org.json.*;  

public class App {  
public static String xml= "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
        "<root>" +
        "<firstName>Gohul</firstName>" +
        "<lastName>KV</lastName>" +
        "<age>22</age>" +
        "<firstName>Rahul</firstName>" +
        "<lastName>KV</lastName>" +
        "<age>25</age>" +
    "</root>";
  
public static void main(String[] args) {  

try {  
JSONObject json = XML.toJSONObject(xml);   
        String jsonString = json.toString(4);  
        System.out.println(jsonString);  
  
}catch (JSONException e) {  
  
System.out.println(e.toString());  
}  
  
}  
  
  
}  