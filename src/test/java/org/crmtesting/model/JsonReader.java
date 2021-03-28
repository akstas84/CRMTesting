package org.crmtesting.model;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {

    public static Object[][] getJSONdata(String JSON_path, String JSON_data ,int JSON_attributes) throws IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader(JSON_path));
        JSONObject jo = (JSONObject)obj;
        JSONArray js = (JSONArray)jo.get(JSON_data);
        Object [][] arr = new String[js.size()][JSON_attributes];
        for (int i = 0; i < js.size(); i++)
        {
            JSONObject obj1 = (JSONObject)js.get(i);
            arr[i][0] = String.valueOf(obj1.get("firstName"));
            arr[i][1] = String.valueOf(obj1.get("email"));
            arr[i][2] = String.valueOf(obj1.get("type"));
            arr[i][3] = String.valueOf(obj1.get("activity"));
        }
        return arr;
    }
}