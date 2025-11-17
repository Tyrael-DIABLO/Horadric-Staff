package com.horadrim.staff.design_pattern.bridge;

public class VoiceRemote extends RemoteControl {
    public VoiceRemote(Device d) { super(d); }
    public void nextChannel() { System.out.print("Voice: next\n"); device.setChannel(2); }
}
