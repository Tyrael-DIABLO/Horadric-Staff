package com.horadrim.staff.design_pattern.strategy;

public class RAID5Strategy implements Strategy {
    @Override
    public void doStrategy() {
        System.out.println("use RAID5 strategy");
    }
}
