package com.app;

public class Student {

    private Long studentId;
    private String stuName;
    private String stuAddress;
    private Long CollegeId;


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public Long getCollegeId() {
        return CollegeId;
    }

    public void setCollegeId(Long collegeId) {
        CollegeId = collegeId;
    }
}
