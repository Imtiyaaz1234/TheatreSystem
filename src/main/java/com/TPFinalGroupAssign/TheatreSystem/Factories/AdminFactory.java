package com.TPFinalGroupAssign.TheatreSystem.Factories;



import com.TPFinalGroupAssign.TheatreSystem.Domain.Admin;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class AdminFactory {

    public static Admin getAdmin(Map<String, Object> values){
        Admin adminFact = new Admin.Builder()
                .id((Long)values.get("id"))
                .name((String) values.get("name"))
                .surname((String) values.get("surname"))
                .build();
        return adminFact;
    }
}
