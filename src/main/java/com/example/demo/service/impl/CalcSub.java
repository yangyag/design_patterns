package com.example.demo.service.impl;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CalcSub implements Calc{
    @Override
    public int execute(int x, int y) {
        return x - y;
    }

    @Override
    public boolean supports(String oper) {
        if ( oper == null )return false;
        return Objects.equals("sub", oper.toLowerCase());
    }
}
