package com.horadrim.staff.design_pattern.adapter;

public class Context {
    public void execute() {
        SquarePeg       square = new SquarePeg(20.0);     // 新对象
        RoundPeg        adapter = new SquareToRoundAdapter(square);
        System.out.println("等效圆半径 = " + adapter.getRadius());
    }
}
