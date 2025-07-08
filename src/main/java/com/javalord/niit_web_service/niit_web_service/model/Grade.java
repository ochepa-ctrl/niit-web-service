package com.javalord.niit_web_service.niit_web_service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Course course;
    @ManyToOne(fetch = FetchType.EAGER)
    private Student student;
    private double score;

}
