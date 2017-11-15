package com.test1.vo.myapplication.Model;

import javax.inject.Inject;

/**
 * Created by vinh on 11/15/2017.
 */

public class Vehicle {
    private Motor motor;
    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void stop(){
        motor.breakMotor();
    }

    public int getSpeed(){
       return motor.getRpm();
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }
}
