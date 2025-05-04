package com.ranger.llmoj.judge.strategy;

import com.ranger.llmoj.model.dto.question.JudgeCase;
import com.ranger.llmoj.judge.codesandbox.model.JudgeInfo;
import com.ranger.llmoj.model.entity.Question;
import com.ranger.llmoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
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
