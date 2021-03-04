package com.game.example.trivia.domain.exceptions;

public class EmptyQuestionTextException extends RuntimeException {
    public EmptyQuestionTextException(String s) {
        super(s);
    }
}
