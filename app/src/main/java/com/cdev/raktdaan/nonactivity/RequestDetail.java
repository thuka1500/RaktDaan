package com.cdev.raktdaan.nonactivity;

import com.cdev.raktdaan.Fragments.ArrayListDetail;

import java.util.ArrayList;

/**
 * Created by ash on 23/05/17.
 */

public class RequestDetail {
    private String name;
    private String age;
    private String gender;
    private String bloodGroup;
    private String bloodUnits;
    private String urgency;
    private String time;
    private String email;
    private String key;
    private ArrayList<ArrayListDetail> accepted;

    public RequestDetail() {
    }

    public RequestDetail(String name, String age, String gender, String bloodGroup, String bloodUnits, String urgency, String time, String email, String key) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.bloodUnits = bloodUnits;
        this.urgency = urgency;
        this.time = time;
        this.email = email;
        this.key = key;
    }

    public RequestDetail(String name, String age, String gender, String bloodGroup, String bloodUnits, String urgency, String time, String email, String key, ArrayList<ArrayListDetail> accepted) {
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.bloodUnits = bloodUnits;
        this.urgency = urgency;
        this.gender = gender;
        this.time = time;
        this.email = email;
        this.key = key;
        this.accepted = accepted;
    }

    public String getTime() {
        return time;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {

        return name;
    }

    public String getAge() {
        return age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getBloodUnits() {
        return bloodUnits;
    }

    public String getUrgency() {
        return urgency;
    }

    public String getEmail() {
        return email;
    }

    public String getKey() {
        return key;
    }

    public ArrayList<ArrayListDetail> getAccepted() {
        return accepted;
    }

    public void setAccepted(ArrayList<ArrayListDetail> accepted) {
        this.accepted = accepted;
    }
}
