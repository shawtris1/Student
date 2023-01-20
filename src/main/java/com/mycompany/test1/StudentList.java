/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1;

/**
 *
 * @author Tristan
 */
public class StudentList {
    public static void main(String[] args) {
        
        
        StudentW23Fri[] studentlist = new StudentW23Fri[3];
        studentlist[0] = new StudentW23Fri("s3", "bob");
        studentlist[1] = new StudentW23Fri("s2", "dave");
        studentlist[2] = new StudentW23Fri("s1", "Tristan") ;
        for (int i = 0; i<studentlist.length ; i++ ) {
            System.out.println(studentlist[i].getStudentName());
        }
        
    }
    
}
