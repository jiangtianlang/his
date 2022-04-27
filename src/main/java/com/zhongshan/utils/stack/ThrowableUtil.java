package com.zhongshan.utils.stack;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Author: jtl
 * @Description: 异常工具
 * @Version: 1.0.0
 */
public class ThrowableUtil {
    /**
     * 获取堆栈信息
     */
    public static String getStackTrace(Throwable throwable) {
        StringWriter sw = new StringWriter();
        try (PrintWriter pw = new PrintWriter(sw)) {
            throwable.printStackTrace(pw);
            return sw.toString();
        }
    }
}
