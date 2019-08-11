package com.jason.batch.project.job.jdbcjob;

import org.springframework.batch.item.file.ResourceSuffixCreator;

/**
 * @description 导出多个文件自定义文件名后缀
 * @author: chenHoll.wang
 * @create: 2019-08-11 18:57
 **/
public class FilmsResourceSuffixCreator implements ResourceSuffixCreator {
    @Override
    public String getSuffix(int index) {
        return "_" + index;
    }
}
