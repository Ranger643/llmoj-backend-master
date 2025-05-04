package com.ranger.llmoj.judge.codesandbox;

import com.ranger.llmoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.ranger.llmoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
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
