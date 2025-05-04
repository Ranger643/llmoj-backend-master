package com.ranger.llmoj.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 更新solving请求
 *

 */
@Data
public class QuestionSolvingUpdateRequest implements Serializable {


    /**
     * id
     */
    private Long id;

  private String solving;


    private static final long serialVersionUID = 1L;
}
