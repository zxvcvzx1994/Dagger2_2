package com.test1.vo.myapplication.Model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vinh on 11/15/2017.
 */
@Module
public class ModuleVehicle {
    @Singleton
    @Provides
    Motor provideMotor(){
      return new Motor();
    };

    @Singleton
    @Provides
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
