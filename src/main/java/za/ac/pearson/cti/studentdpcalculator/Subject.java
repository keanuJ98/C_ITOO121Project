/*
 *Author: Paul Treurnicht
 *Operating System: Windows 8.1
 *Description: This is a student DP calulator that calculates the DP for a student and then tests it against certain validations.
 *DV2012-0003 
 */
package za.ac.pearson.cti.studentdpcalculator;

public class Subject {
    
    private String name;
    private Double semesterTestMark;
    private Double continuousAssessmentMark;
    private Double assessmentMark;
    private Double semesterTestWeight;
    private Double continuousAssessmentWeight;
    private Double assessmentWeight;

    public Subject(String name, Double semesterTestMark, Double continuousAssessmentMark, Double assessmentMark, Double semesterTestWeight, Double continuousAssessmentWeight, Double assessmentWeight) {
        this.name = name;
        this.semesterTestMark = semesterTestMark;
        this.continuousAssessmentMark = continuousAssessmentMark;
        this.assessmentMark = assessmentMark;
        this.semesterTestWeight = semesterTestWeight;
        this.continuousAssessmentWeight = continuousAssessmentWeight;
        this.assessmentWeight = assessmentWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSemesterTestMark() {
        return semesterTestMark;
    }

    public void setSemesterTestMark(Double semesterTestMark) {
        this.semesterTestMark = semesterTestMark;
    }

    public Double getContinuousAssessmentMark() {
        return continuousAssessmentMark;
    }

    public void setContinuousAssessmentMark(Double continuousAssessmentMark) {
        this.continuousAssessmentMark = continuousAssessmentMark;
    }

    public Double getAssessmentMark() {
        return assessmentMark;
    }

    public void setAssessmentMark(Double assessmentMark) {
        this.assessmentMark = assessmentMark;
    }

    public Double getSemesterTestWeight() {
        return semesterTestWeight;
    }

    public void setSemesterTestWeight(Double semesterTestWeight) {
        this.semesterTestWeight = semesterTestWeight;
    }

    public Double getContinuousAssessmentWeight() {
        return continuousAssessmentWeight;
    }

    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        this.continuousAssessmentWeight = continuousAssessmentWeight;
    }

    public Double getAssessmentWeight() {
        return assessmentWeight;
    }

    public void setAssessmentWeight(Double assessmentWeight) {
        this.assessmentWeight = assessmentWeight;
    }  
}
