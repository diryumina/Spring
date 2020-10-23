package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {

    //OfficeHours officeHours;

//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

//    @Override
//    public void getTeachingHours() {
//        System.out.println("Weekly teaching hours: " + (25 + officeHours.getHours()));
//    }


    //creating an object out of interface is more efficient, because we are using loosely coupled concept
    //and if any changes are made in java or selenium classes, it'll be taken care of ny extraSessions object
    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (25 + extraSessions.getHours()));
    }

}
