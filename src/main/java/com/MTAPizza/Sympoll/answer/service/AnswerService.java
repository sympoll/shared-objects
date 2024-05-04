package com.MTAPizza.Sympoll.answer.service;

import com.MTAPizza.Sympoll.answer.Answer;
import com.MTAPizza.Sympoll.answer.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public void addNewAnswer(Answer answer){
        answerRepository.save(answer);
    }
}
