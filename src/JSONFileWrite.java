import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JSONFileWrite {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        JSONObject obj = new JSONObject();
        obj.put("Private key", "1q2w3e4r5t6y7u8i9o");
        obj.put("Transaction", "5 bandwith coins");

        /*JSONArray company = new JSONArray();
        company.add("Private key: 123456789");
        company.add("Public key: 987654321");
        company.add("Transactions: 5 bandwith coins");
        obj.put("Wallet", company);*/

        // try-with-resources statement based on post comment below :)
        try (FileWriter file = new FileWriter("/Users/davidgomezdesegura/Desktop/file1.txt")) {
            file.write(obj.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
        }
    }
}