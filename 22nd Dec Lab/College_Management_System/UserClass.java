package com.cms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="College_Student_Details")
public class UserClass {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String firstName, lastName, email;
private int age;
private long phone;
private String dept;
private double cgpa;
}