package org.example;

import com.example.util.HttpClientUtil;
import org.apache.hc.core5.http.ParseException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class HttpClientUtilTest {

    @Test
    void testHttpClientGet() throws IOException, ParseException {
        String response = HttpClientUtil.get("https://jsonplaceholder.typicode.com/posts/1");
        assertNotNull(response);
    }
}