package com.yilei.tryshop.dao;

import com.yilei.tryshop.entity.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface QuestionDao {

    @Insert("insert into t_question(id, type, describe_info, submiter,solve_flag, doc_link, solve_duration,cause,hack_plan,env_link)" +
            " values (#{id}, #{type}, #{describeInfo}, #{submiter}, #{solveFlag},#{docLink},#{solveDuration},#{cause},#{hackPlan},#{envLink})")
    void insertQuestion(Question userAclDO);

    @Update("update  t_question set delete_flag = 1 where id = #{id}")
    void deleteQuestionById(Long id);

    void updateQuestion(Question question);
    //查单个
    @Select("select * from t_question where id = #{id}")
    Question selectQuestionById(Long id);
    //分页查询
    List<Question> selectQuestionList();
}
