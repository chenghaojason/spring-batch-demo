package com.jason.batch.project.job.personjob;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

public class TestFileProgessor implements ItemProcessor<PersonModel, PersonModel> {

    private static final Logger LOGGER=Logger.getLogger(TestFileProgessor.class);
    @Override
    public PersonModel process(PersonModel person) throws Exception {
        return person;
    }
}
