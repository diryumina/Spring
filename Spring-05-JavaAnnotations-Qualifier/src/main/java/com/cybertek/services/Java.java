package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Qualifier("officeHours")
    private ExtraSessions extraSessions;

    //   OR

    //with the new version of Spring, don't need @Autowired annotation, done automatically by the system
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly teaching hourse: " + (20 + extraSessions.getHours()));
    }
}
