/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timetableapp;

/**
 *
 * @author osman
 */
public class OnlineClasses extends Timetable{
    private String url;
    
    public OnlineClasses(){
        super();
        url = new String();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public OnlineClasses(String url, String day, String lecturer, String time, int duration) {
        super(day, lecturer, time, duration);
        this.url = url;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nUrl : " + url; 
    }
    
    
    
}
