package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    public static void main(String[] args) {

        data[0] = new Student("Sekar", new int[] {85,75,95});
        data[1] = new Student(null, new int[] {11,22,33});
        data[2] = null;
        data[3] = new Student("Manoj", null);

        StudentReport report = new StudentReport();

        for (Student s : data) {

            try {

                if (report.validate(s).equals("VALID")) {
                    System.out.println("Grade : " + report.findGrades(s));
                }

            } catch (NullNameException e) {

                e.printStackTrace();

            } catch (NullMarksArrayException e) {

                e.printStackTrace();

            } catch (NullStudentObjectException e) {

                e.printStackTrace();

            }

        }

        StudentService service = new StudentService();

        System.out.println("Null Marks Array = "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Null Name = "
                + service.findNumberOfNullName(data));

        System.out.println("Null Objects = "
                + service.findNumberOfNullObjects(data));

    }
}