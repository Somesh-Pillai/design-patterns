package com.spring.batch.immutable.designpatterns.adapterPattern;

public class PenAdapter implements Pen{
    //using composition we use implementation on Pilot Pen like an adapter
    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
