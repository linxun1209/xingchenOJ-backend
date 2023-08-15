package com.xingchen.oj.judge;


import com.xingchen.oj.model.entity.QuestionSubmit;

/**
 * 判题服务
 * @author xing'chen
 */
public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
