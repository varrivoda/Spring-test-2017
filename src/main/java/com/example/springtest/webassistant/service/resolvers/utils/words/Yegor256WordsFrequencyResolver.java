package com.example.springtest.webassistant.service.resolvers.utils.words;

import com.example.springtest.common.utils.WordsComposer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static lombok.AccessLevel.PACKAGE;

@Component
public class Yegor256WordsFrequencyResolver extends AbstractWordsFrequencyResolver {


    @Getter
    @Setter(PACKAGE)
    @Value("${tokens.yegor256}")
    private String answers;

    public Yegor256WordsFrequencyResolver(WordsComposer wordsComposer){
        super(wordsComposer);
    }

    @Override
    public QuestionType getQuestionType(){
        return YEGOR256;
    }

}
