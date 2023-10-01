package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    public CricketCoach(){
        System.out.println("In constructor "+ getClass().getSimpleName());
    }

    @PostConstruct
    public void doMystartupStuff(){
        System.out.println("In doMystartupStuffs "+ getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff "+ getClass().getSimpleName());
    }


@Override
    public String getDailyWorkout(){
        return "practice fast bowling for 15 min setter injection";
    }
}
