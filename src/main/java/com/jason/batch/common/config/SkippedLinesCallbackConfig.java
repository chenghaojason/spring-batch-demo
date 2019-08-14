package com.jason.batch.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.LineCallbackHandler;

public class SkippedLinesCallbackConfig implements LineCallbackHandler {

    private static final Logger logger = LoggerFactory.getLogger(SkippedLinesCallbackConfig.class);

    @Override
    public void handleLine(String s) {
        logger.info("读取文件跳过的数据：[{}]", s);
    }
}
