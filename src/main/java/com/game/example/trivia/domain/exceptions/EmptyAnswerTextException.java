package com.game.example.trivia.domain.exceptions;

public class EmptyAnswerTextException extends RuntimeException {
    public EmptyAnswerTextException(String s) {
        super(s);
    }
}
