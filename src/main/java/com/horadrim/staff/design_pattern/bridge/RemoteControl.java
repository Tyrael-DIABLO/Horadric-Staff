package com.horadrim.staff.design_pattern.bridge;

public abstract class RemoteControl {
    protected Device device;          // 🔑桥接点：组合实现
    protected RemoteControl(Device d) { this.device = d; }

    public void powerOn()  { device.powerOn(); }
    public void powerOff() { device.powerOff(); }
    public abstract void nextChannel(); // 抽象行为
}
