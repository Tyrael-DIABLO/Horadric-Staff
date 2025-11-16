package com.horadrim.staff.design_pattern.bridge;

public class Tv implements Device {
    public void powerOn()  { System.out.println("TV ON"); }
    public void powerOff() { System.out.println("TV OFF"); }
    public void setChannel(int ch) { System.out.println("TV channel " + ch); }
}
