package com.survey.personalitytest.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseObject {
    private int serviceCode;
    private String serviceMessage;
    private Integer testId;
}
