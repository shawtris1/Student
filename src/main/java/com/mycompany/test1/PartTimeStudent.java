/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1;

/**
 *
 * @author Tristan
 */
public class PartTimeStudent extends StudentW23Fri {
    
    private int numerOfCourse;

    public PartTimeStudent(int numerOfCourse, String studentId, String studentName) {
        super(studentId, studentName);
        this.numerOfCourse = numerOfCourse;
    }

    public void setNumerOfCourse(int numerOfCourse) {
        this.numerOfCourse = numerOfCourse;
    }

    public int getNumerOfCourse() {
        return numerOfCourse;
    }
    
    
}
