package com.venkatesh.university.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "enrolement")
public class Enrolement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "enrolement_id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Course course;

    @Column(name = "enrolement_date")
    private String enrolementDate;
}
