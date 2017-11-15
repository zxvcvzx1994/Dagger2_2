package com.test1.vo.myapplication.Controller;

import com.test1.vo.myapplication.Model.ModuleVehicle;
import com.test1.vo.myapplication.Model.Vehicle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by vinh on 11/15/2017.
 */
@Singleton
@Component(modules = ModuleVehicle.class)
public interface ComponentVehicle {
    Vehicle provideVehicle();
}
