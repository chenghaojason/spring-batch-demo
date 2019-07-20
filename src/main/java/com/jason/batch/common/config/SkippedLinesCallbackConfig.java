package com.jason.batch.common.config;

import org.apache.log4j.Logger;
import org.springframework.batch.item.file.LineCallbackHandler;

public class SkippedLinesCallbackConfig implements LineCallbackHandler {

    private static final Logger LOGGER = Logger.getLogger(SkippedLinesCallbackConfig.class);

    @Override
    public void handleLine(String s) {
        LOGGER.info("读取文件跳过的数据：[" + s + "]");
    }
}
