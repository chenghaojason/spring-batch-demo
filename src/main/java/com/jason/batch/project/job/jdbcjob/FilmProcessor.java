package com.jason.batch.project.job.jdbcjob;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

public class FilmProcessor implements ItemProcessor<FilmModel,FilmModel> {

    private Logger logger=Logger.getLogger(FilmProcessor.class);
    @Override
    public FilmModel process(FilmModel filmModel) throws Exception {
        return filmModel;
    }
}
