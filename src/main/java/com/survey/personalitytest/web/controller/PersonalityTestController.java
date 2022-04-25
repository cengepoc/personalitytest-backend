package com.survey.personalitytest.web.controller;

import com.survey.personalitytest.service.IPersonalityTestService;
import com.survey.personalitytest.web.model.PersonalityTestDto;
import com.survey.personalitytest.web.model.ResponseObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/personalitytest")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonalityTestController {

    IPersonalityTestService testService;
    public PersonalityTestController(IPersonalityTestService testService) {
        this.testService = testService;
    }

    @PostMapping("/saveTest")
    public ResponseEntity<ResponseObject> saveTest(@Validated @RequestBody PersonalityTestDto[] personalityTestDtos){
        try {
            return ResponseEntity.ok().body(testService.saveTest(personalityTestDtos));
        }catch (Exception e){
            log.error("Something went wrong", e);
            return ResponseEntity.internalServerError().body(
                    ResponseObject.builder()
                            .serviceCode(-1)
                            .serviceMessage("Something went wrong")
                            .build());
        }
    }

}
