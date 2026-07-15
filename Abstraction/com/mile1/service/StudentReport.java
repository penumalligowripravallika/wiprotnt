package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student s)
            throws NullNameException, NullMarksArrayException, NullStudentObjectException {

        if (s == null)
            throw new NullStudentObjectException();

        if (s.getName() == null)
            throw new NullNameException();

        if (s.getMarks() == null)
            throw new NullMarksArrayException();

        return "VALID";
    }

    public String findGrades(Student s) {

        int marks[] = s.getMarks();

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35)
                return "F";
        }

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        if (sum < 150)
            return "C";
        else if (sum < 200)
            return "B";
        else if (sum < 250)
            return "A";
        else
            return "A+";
    }
}