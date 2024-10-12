package com.marks;

public class StudentImpl {
    public static void main(String[] args) {
        // For Medical Pathway
        StudentMarks medicalStudent = new StudentMarks();
        int medicalTotalMarks = medicalStudent.calculateMarks(90, 85, 88, 92);
        System.out.println("Total marks for Medical pathway: " + medicalTotalMarks);

        // For Non-Medical Pathway
        StudentMarks nonMedicalStudent = new StudentMarks();
        int nonMedicalTotalMarks = nonMedicalStudent.calculateMarks(85, 88, 92);
        System.out.println("Total marks for Non-Medical pathway: " + nonMedicalTotalMarks);

        // For Business Pathway
        StudentMarks businessStudent = new StudentMarks();
        int businessTotalMarks = businessStudent.calculateMarks(78);
        System.out.println("Total marks for Business pathway: " + businessTotalMarks);
    }
}
