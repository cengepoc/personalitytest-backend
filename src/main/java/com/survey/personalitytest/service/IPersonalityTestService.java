package com.survey.personalitytest.service;

import com.survey.personalitytest.web.model.PersonalityTestDto;
import com.survey.personalitytest.web.model.ResponseObject;

public interface IPersonalityTestService {

    public PersonalityTestDto getTestById(long id);
    public ResponseObject saveTest(PersonalityTestDto[] testDtos);

}
