package com.game.example.trivia.domain.exceptions;

public class InvalidLevelException extends RuntimeException {
    public InvalidLevelException(String s) {
        super(s);
    }
}
