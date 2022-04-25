package com.survey.personalitytest.service;

import com.survey.personalitytest.entity.PersonalityTest;
import com.survey.personalitytest.entity.Test;
import com.survey.personalitytest.repository.PersonalityTestRepository;
import com.survey.personalitytest.repository.TestRepository;
import com.survey.personalitytest.web.model.PersonalityTestDto;
import com.survey.personalitytest.web.model.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonalityTestServiceImpl implements IPersonalityTestService {

    @Autowired
    PersonalityTestRepository ptRepository;
    @Autowired
    TestRepository tRepository;

    @Override
    public PersonalityTestDto getTestById(long id) {
        return null;
    }

    @Override
    public ResponseObject saveTest(PersonalityTestDto[] testDtos) {

        Test t = new Test();
        List<PersonalityTest> answers = new ArrayList<>();
        for(PersonalityTestDto p : testDtos){
            PersonalityTest personalityTest = new PersonalityTest();
            personalityTest.setCategory(p.getCategory());
            personalityTest.setAnswer(p.getAnswer());
            personalityTest.setQuestion(p.getQuestion());
            personalityTest.setQuestionId(p.getId());
            answers.add(personalityTest);
        }
        t.setAnswers(answers);

        tRepository.save(t);

        return ResponseObject.builder().serviceCode(0)
                .serviceMessage("Test was successfully saved.")
                .testId(t.getTestid()).build();
    }
}
