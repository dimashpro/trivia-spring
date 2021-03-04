package com.game.example.trivia.domain;

import lombok.Data;

@Data
abstract class HelpOption {
    private boolean isUsed = false;
    private boolean isInvoked = false;

    public abstract void invoke(Question question);
}
