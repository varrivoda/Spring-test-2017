package com.example.springtest.common.utils;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//скриншот 7:30


public class WordsComposer {
    List<String> words = new ArrayList<>();

    List<String> getWords(String text) {
        if(lastIndex!= BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))){
            words.add(text.substring(firstIndex, lastIndex));
        }
        return words;
    }

    //todo проверить импорт
    private Predicate<String> notGarbage(){
        return s-> !garbageProperties.getGarbage().contains(s.toLowerCase());
    }

}
