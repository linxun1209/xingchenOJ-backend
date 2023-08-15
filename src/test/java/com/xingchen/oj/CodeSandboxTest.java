package com.xingchen.oj;

import com.xingchen.oj.judge.codesandbox.CodeSandbox;
import com.xingchen.oj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.xingchen.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.xingchen.oj.judge.codesandbox.model.ExecuteCodeResponse;
import com.xingchen.oj.model.enums.QuestionSubmitLanguageEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author xingchen
 * @version V1.0
 * @Package com.xingchen.oj
 * @date 2023/8/15 10:02
 */
@SpringBootTest
class CodeSandboxTest {

    @Test
    void executeCode() {
        CodeSandbox codeSandbox = new RemoteCodeSandbox();
        String code = "int main() { }";
        String language = QuestionSubmitLanguageEnum.JAVA.getValue();
        List<String> inputList = Arrays.asList("1 2", "3 4");
        ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                .code(code)
                .language(language)
                .inputList(inputList)
                .build();
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        Assertions.assertNotNull(executeCodeResponse);
    }
}