package com.horadrim.staff.design_pattern.adapter;

// 把方钉“伪装”成圆孔
public class SquareToRoundAdapter implements RoundPeg {
    private final SquarePeg square;   // 组合而非继承

    public SquareToRoundAdapter(SquarePeg square) {
        this.square = square;
    }

    @Override
    public double getRadius() {
        // 用方钉数据算出等效圆半径
        return square.getWidth() * Math.sqrt(2.0) / 2.0;
    }
}
