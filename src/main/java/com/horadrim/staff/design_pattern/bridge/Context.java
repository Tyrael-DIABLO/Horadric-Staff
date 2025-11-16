package com.horadrim.staff.design_pattern.bridge;

public class Context {
    public void execute() {
        Device tv = new Tv();
        RemoteControl basic = new BasicRemote(tv);
        basic.powerOn();
        basic.nextChannel();   // TV ON / TV channel 1
        basic.powerOff();

        Device radio = new Radio();
        RemoteControl voice = new VoiceRemote(radio);
        voice.powerOn();
        voice.nextChannel();   // Radio ON / Voice: next / Radio frequency 2
        voice.powerOff();
    }
}
