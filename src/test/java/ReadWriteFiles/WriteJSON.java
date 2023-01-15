package ReadWriteFiles;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {

    public static void main(String[] args) {

        String filePath = System.getProperty("user.dir") + "\\Resources\\WriteJSON.json";

        JSONObject obj1 = new JSONObject();
        obj1.put("FN", "F1");
        obj1.put("LN", "L1");

        JSONObject obj2 = new JSONObject();
        obj2.put("FN", "F1");
        obj2.put("LN", "L1");

        JSONObject obj3 = new JSONObject();
        obj3.put("EMP", obj1);

        JSONObject obj4 = new JSONObject();
        obj4.put("EMP", obj2);

        JSONArray jsonArr = new JSONArray();
        jsonArr.add(obj3);
        jsonArr.add(obj4);

        File file = new File(filePath);
        try (FileWriter wr = new FileWriter(file)){

            wr.write(jsonArr.toJSONString());
            wr.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Writing to a JSON file is completed");
    }





}
