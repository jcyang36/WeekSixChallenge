package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by student on 6/23/17.
 */
@Entity
public class Record {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String first;
    private String middle;
    private String last;
    private String school;
    private String company;
    private String skills;





}
