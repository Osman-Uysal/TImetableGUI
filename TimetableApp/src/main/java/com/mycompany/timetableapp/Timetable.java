/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timetableapp;

import java.io.Serializable;

/**
 *
 * @author osman
 */
public class Timetable implements Serializable {
    protected String day, lecturer, time;
    protected int duration;

    public Timetable(){
        day = new String();
        lecturer = new String();
        time = new String();
        duration = 0;
    } 
    
    
    public Timetable(String day, String lecturer, String time, int duration) {
        this.day = day;
        this.lecturer = lecturer;
        this.time = time;
        this.duration = duration;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public String getDetails(){
        return "Timetable:\n Time : "+ time +"\nDuration : "+duration+"\nDay : "+ day + "\n Lecturer : " + lecturer;
    }
    
}
