package com.ranger.llmoj.judge;

import com.ranger.llmoj.judge.strategy.DefaultJudgeStrategy;
import com.ranger.llmoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.ranger.llmoj.judge.strategy.JudgeContext;
import com.ranger.llmoj.judge.strategy.JudgeStrategy;
import com.ranger.llmoj.judge.codesandbox.model.JudgeInfo;
import com.ranger.llmoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
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
