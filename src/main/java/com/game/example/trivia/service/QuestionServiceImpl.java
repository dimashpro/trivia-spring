package com.game.example.trivia.service;

import com.game.example.trivia.domain.Question;
import com.game.example.trivia.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;

    @Override
    public List<Question> getQuestionsByLevel(int level) {
        List<Question> questionsByLevel = questionRepository.findQuestionsByLevel(level);
        Collections.shuffle(questionsByLevel);
        return questionsByLevel;
    }

    @Override
    public boolean save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public boolean delete(Question question) {
        return questionRepository.delete(question);
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }


}
