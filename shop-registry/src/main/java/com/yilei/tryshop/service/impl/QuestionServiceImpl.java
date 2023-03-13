package com.yilei.tryshop.service.impl;

import com.yilei.tryshop.dao.QuestionDao;
import com.yilei.tryshop.entity.Question;
import com.yilei.tryshop.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    @Transactional
    @Override
    public void addQuestion(Question question) {
        questionDao.insertQuestion(question);
    }

    @Transactional
    @Override
    public void removeQuestionById(Long id) {
        questionDao.deleteQuestionById(id);
    }

    @Override
    public Question queryQuestionById(Long id) {
        return questionDao.selectQuestionById(id);
    }
}
