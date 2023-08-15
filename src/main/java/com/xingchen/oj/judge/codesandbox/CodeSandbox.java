package com.xingchen.oj.judge.codesandbox;


import com.xingchen.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.xingchen.oj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 * @author xing'chen
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
