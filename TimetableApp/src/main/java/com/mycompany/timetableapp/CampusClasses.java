/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timetableapp;

/**
 *
 * @author osman
 */
public class CampusClasses extends Timetable{
    private String room;

    public CampusClasses() {
        room = new String();
    }

    public CampusClasses(String day, String lecturer, String time, int duration) {
        super(day, lecturer, time, duration);
    }

    
    
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\n Room Number : " + room;
    }
    
    
}
