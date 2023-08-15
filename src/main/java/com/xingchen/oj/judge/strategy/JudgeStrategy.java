package com.xingchen.oj.judge.strategy;


import com.xingchen.oj.model.dto.questionsubmit.JudgeInfo;

/**
 * 判题策略
 * @author xing'chen
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
