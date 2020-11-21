package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //Field Injection
    @Autowired
    private OfficeHours officeHours;
    private ExtraSessions extraSessions;

//
//    //Constructor Injection - need to create constructor
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public OfficeHours getOfficeHours(){
        return officeHours;
    }

//
//    //Setter Injection - need Setter
//@Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly teaching hourse: " + (30 + officeHours.getHours())); //+extraSessions.getHours()
    }
}
