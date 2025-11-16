package com.horadrim.staff.design_pattern.bridge;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device d) { super(d); }
    public void nextChannel() { device.setChannel(1); }
}
