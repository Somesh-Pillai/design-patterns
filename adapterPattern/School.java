package com.spring.batch.immutable.designpatterns.adapterPattern;

public class School {

    public static void main(String[] args) {
        Pen penAdapter = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(penAdapter);
        assignmentWork.writeAssignment("Assignment done");
    }
}
