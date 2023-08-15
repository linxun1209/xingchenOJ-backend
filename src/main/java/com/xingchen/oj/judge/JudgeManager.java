package com.xingchen.oj.judge;


import com.xingchen.oj.judge.strategy.DefaultJudgeStrategy;
import com.xingchen.oj.judge.strategy.JavaLanguageJudgeStrategy;
import com.xingchen.oj.judge.strategy.JudgeContext;
import com.xingchen.oj.judge.strategy.JudgeStrategy;
import com.xingchen.oj.model.dto.questionsubmit.JudgeInfo;
import com.xingchen.oj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 * @author xing'chen
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
