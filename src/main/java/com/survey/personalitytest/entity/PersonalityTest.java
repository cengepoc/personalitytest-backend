package com.survey.personalitytest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="TEST_RESULTS")
@Data
public class PersonalityTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="questionid")
    private Integer questionId;

    @Column(name="question")
    private String question;

    @Column(name="category")
    private String category;

    @Column(name="answer")
    private String answer;

    @ManyToOne
    @JoinColumn(name="test_id")
    private Test test;
}
