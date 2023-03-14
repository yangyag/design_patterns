package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CalcRequest {
    @NotNull
    private String oper;

    @NotNull
    private int x;

    @NotNull
    private int y;
}
