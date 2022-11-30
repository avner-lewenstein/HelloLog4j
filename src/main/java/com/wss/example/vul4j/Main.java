package com.wss.example.vul4j;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);
    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws InterruptedException, IOException {
        for (int i= 0; i < 100; i++) {
            logger.info("Hello world");


            final X x = mapper.readValue(new StringReader("{\"x\": \"y\", \"z\": [1, 2, 3]}"), X.class);
            logger.info(mapper.writeValueAsString(x));
            Thread.sleep(5000);
        }
    }
}
