package com.ranger.llmoj.model.dto.questionsubmit;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *

 */
@Data
public class QuestionSubmitUpdateRequest implements Serializable {

    /**
     * 代码建议
     */
    private String codeOptimize;

    /**
     * 提交记录
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
