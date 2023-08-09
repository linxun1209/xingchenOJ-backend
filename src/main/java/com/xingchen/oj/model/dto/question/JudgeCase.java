package com.xingchen.oj.model.dto.question;

import lombok.Data;

/**
 * 题目用例
 * @author xing'chen
 */
@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}
