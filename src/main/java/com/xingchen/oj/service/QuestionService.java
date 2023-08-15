package com.xingchen.oj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xingchen.oj.model.dto.question.QuestionQueryRequest;
import com.xingchen.oj.model.entity.Question;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xingchen.oj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author xing'chen
* @description 针对表【question(题目)】的数据库操作Service
* @createDate 2023-08-08 19:38:14
*/
public interface QuestionService extends IService<Question> {

    void validQuestion(Question question, boolean b);

    QuestionVO getQuestionVO(Question question, HttpServletRequest request);

    QueryWrapper<Question> getQueryWrapper(QuestionQueryRequest questionQueryRequest);

    Page<QuestionVO> getQuestionVOPage(Page<Question> questionPage, HttpServletRequest request);

}
