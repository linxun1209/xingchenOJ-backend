package com.xingchen.oj.judge.strategy;


import com.xingchen.oj.model.dto.question.JudgeCase;
import com.xingchen.oj.model.dto.questionsubmit.JudgeInfo;
import com.xingchen.oj.model.entity.Question;
import com.xingchen.oj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 * @author xing'chen
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
