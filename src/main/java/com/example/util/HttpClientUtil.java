package com.example.util;

import java.io.IOException;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.ParseException;



public class HttpClientUtil {
    public static String get(String url) throws IOException, ParseException {
        return Request.get(url)
                .execute()
                .returnContent()
                .asString();
    }
}
