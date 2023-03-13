package com.yilei.tryshop.contoller;

import com.yilei.tryshop.entity.Question;
import com.yilei.tryshop.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAclController {

    @Autowired
    private QuestionService questionService;
    //1.注册
    @GetMapping("/addtest")
    public String regiestUserAcl() {
        Question question = new Question();
        question.setId(1L);
        question.setCause("");
        question.setDescribeInfo("");
        question.setDocLink("");
        question.setEnvLink("");
        question.setHackPlan("");
        question.setSolveDuration(0.5);
        question.setSubmiter("wb-yl841283");
        question.setType(1);
        questionService.addQuestion(question);
        return "注册成功";
    }
    //2.登录

}
