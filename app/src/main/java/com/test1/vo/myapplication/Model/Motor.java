package com.test1.vo.myapplication.Model;

/**
 * Created by vinh on 11/15/2017.
 */

public class Motor {
    private int rpm;

    public Motor(){
        rpm=0;
    }

    public void breakMotor(){
        rpm=0;
    }

    public void accelerate(int value){
        rpm+=value;
    }

    public int getRpm(){
        return rpm;
    }
}
