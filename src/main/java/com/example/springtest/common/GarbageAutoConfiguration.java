package com.example.springtest.common;

import com.example.springtest.common.utils.AnswerComposer;
import com.example.springtest.common.utils.WordsComposer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.beans.BeanProperty;

@Configuration

@PropertySource("classpath:user.properties")
public class GarbageAutoConfiguration {

    @Bean
    GarbageProperties garbageProperties(){return new GarbageProperties();}

    @Bean
    WordsComposer wordsComposer(){return new WordsComposer();}

    @Bean
    AnswerComposer answerComposer(){return new AnswerComposer();}
}
