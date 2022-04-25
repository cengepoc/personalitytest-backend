package com.survey.personalitytest.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonalityTestDto {

    private Integer id;
    private String question;
    private String category;
    private String answer;
}