package com.game.example.trivia.service;


import com.game.example.trivia.domain.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestionsByLevel(int level);

    boolean save(Question question);

    boolean delete(Question question);

    List<Question> getAll();
}
