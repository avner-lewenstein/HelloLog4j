package com.wss.example.vul4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {
        for (int i= 0; i < 100; i++) {
            logger.info("Hello world");

            final JSONObject jsonObject = new JSONObject("{\"x\": \"y\", \"z\": [1, 2, 3]}");
            System.out.println(jsonObject.getJSONArray("z").length());
            Thread.sleep(5000);
        }
    }
}
