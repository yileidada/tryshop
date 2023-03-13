package com.yilei.tryshop.service;

import com.yilei.tryshop.entity.Question;

public interface QuestionService {
    /**
     * 添加问题
     * @param question
     */
    void addQuestion(Question question);

    /**
     * 删除问题
     * @param id
     */
    void removeQuestionById(Long id);

    /**
     * 查询问题
     * @param id
     * @return
     */
    Question queryQuestionById(Long id);
}
