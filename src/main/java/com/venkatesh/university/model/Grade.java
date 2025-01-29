package com.venkatesh.university.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "grade_id")
    private Integer id;

    @Column(name = "grade_value")
    private String gradeValue;

    @ManyToOne
    @JoinColumn(name = "enrolement_id", referencedColumnName = "enrolement_id")
    private Enrolement enrolement;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;
}
