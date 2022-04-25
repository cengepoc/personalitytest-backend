package com.survey.personalitytest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TEST")
@Data
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Integer testid;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,  fetch = FetchType.LAZY, mappedBy = "test")
    private List<PersonalityTest> answers;
}
