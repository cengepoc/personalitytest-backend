package com.survey.personalitytest.repository;

import com.survey.personalitytest.entity.PersonalityTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalityTestRepository extends JpaRepository<PersonalityTest, Integer> {
}
