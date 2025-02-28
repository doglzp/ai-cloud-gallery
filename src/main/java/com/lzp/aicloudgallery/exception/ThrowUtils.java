package com.lzp.aicloudgallery.exception;

import com.lzp.aicloudgallery.exception.BusinessException;
import com.lzp.aicloudgallery.exception.ErrorCode;

public class ThrowUtils {

    public static void throwIf(boolean condition, ErrorCode errorCode) {
        if (condition) {
            throw new BusinessException(errorCode);
        }
    }

    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        if (condition) {
            throw new BusinessException(errorCode, message);
        }
    }

    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }
}
