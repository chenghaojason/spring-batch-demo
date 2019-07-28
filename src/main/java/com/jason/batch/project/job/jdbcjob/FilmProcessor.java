package com.jason.batch.project.job.jdbcjob;

import org.springframework.batch.item.ItemProcessor;

public class FilmProcessor implements ItemProcessor<FilmModel,FilmModel> {
    @Override
    public FilmModel process(FilmModel filmModel) throws Exception {
        return filmModel;
    }
}
