package com.construap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LogUtils {
    private static final Logger logger = LoggerFactory.getLogger(LogUtils.class);
    private static final String LOG_CODE_KEY = "logCode";
    private static void setupMDC(String logCode) {
        MDC.put(LOG_CODE_KEY, logCode);
    }
    private static void clearMDC() {
        MDC.clear();
    }
    public static void trace(String logCode, String msg) {
        try {
            setupMDC(logCode);
            logger.trace(msg);
        } finally {
            clearMDC();
        }
    }
    public static void trace(String logCode, String format, Object arg) {
        try {
            setupMDC(logCode);
            logger.trace(format, arg);
        } finally {
            clearMDC();
        }
    }
    public static void trace(String logCode, String format, Object arg1, Object arg2) {
        try {
            setupMDC(logCode);
            logger.trace(format, arg1, arg2);
        } finally {
            clearMDC();
        }
    }
    public static void debug(String logCode, String msg) {
        try {
            setupMDC(logCode);
            logger.debug(msg);
        } finally {
            clearMDC();
        }
    }
    public static void debug(String logCode, String format, Object arg) {
        try {
            setupMDC(logCode);
            logger.debug(format, arg);
        } finally {
            clearMDC();
        }
    }
    public static void debug(String logCode, String format, Object arg1, Object arg2) {
        try {
            setupMDC(logCode);
            logger.debug(format, arg1, arg2);
        } finally {
            clearMDC();
        }
    }
    public static void info(String logCode, String msg) {
        try {
            setupMDC(logCode);
            logger.info(msg);
        } finally {
            clearMDC();
        }
    }
    public static void info(String logCode, String format, Object arg) {
        try {
            setupMDC(logCode);
            logger.info(format, arg);
        } finally {
            clearMDC();
        }
    }
    public static void info(String logCode, String format, Object arg1, Object arg2) {
        try {
            setupMDC(logCode);
            logger.info(format, arg1, arg2);
        } finally {
            clearMDC();
        }
    }
    public static void warn(String logCode, String msg) {
        try {
            setupMDC(logCode);
            logger.warn(msg);
        } finally {
            clearMDC();
        }
    }
    public static void warn(String logCode, String format, Object arg) {
        try {
            setupMDC(logCode);
            logger.warn(format, arg);
        } finally {
            clearMDC();
        }
    }
    public static void warn(String logCode, String format, Object arg1, Object arg2) {
        try {
            setupMDC(logCode);
            logger.warn(format, arg1, arg2);
        } finally {
            clearMDC();
        }
    }
    public static void error(String logCode, String msg) {
        try {
            setupMDC(logCode);
            logger.error(msg);
        } finally {
            clearMDC();
        }
    }
    public static void error(String logCode, String format, Object arg) {
        try {
            setupMDC(logCode);
            logger.error(format, arg);
        } finally {
            clearMDC();
        }
    }
    public static void error(String logCode, String format, Object arg1, Object arg2) {
        try {
            setupMDC(logCode);
            logger.error(format, arg1, arg2);
        } finally {
            clearMDC();
        }
    }
}
