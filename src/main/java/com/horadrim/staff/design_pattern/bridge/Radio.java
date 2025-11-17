package com.horadrim.staff.design_pattern.bridge;

public class Radio implements Device {
    public void powerOn()  { System.out.println("Radio ON"); }
    public void powerOff() { System.out.println("Radio OFF"); }
    public void setChannel(int ch) { System.out.println("Radio frequency " + ch);
    }
}
