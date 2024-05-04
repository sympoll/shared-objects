package com.MTAPizza.Sympoll.answer.repository;

import com.MTAPizza.Sympoll.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
