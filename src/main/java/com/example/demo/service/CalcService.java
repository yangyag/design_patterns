package com.example.demo.service;

import com.example.demo.service.impl.Calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalcService {

    @Autowired
    private List<Calc> calcs;

    public Calc resolve(String oper) {
        return calcs.stream().filter(it -> it.supports(oper))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("없음"));
    }
}
