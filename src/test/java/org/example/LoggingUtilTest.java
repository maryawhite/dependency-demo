package org.example;

import com.example.util.LoggingUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggingUtilTest {

    @Test
    void testLogInfo() {
        assertDoesNotThrow(() -> LoggingUtil.logInfo("Test info log"));
    }

    @Test
    void testLogError() {
        assertDoesNotThrow(() -> LoggingUtil.logError("Test error log", new Exception("Test Exception")));
    }
}