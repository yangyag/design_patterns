package com.example.demo;

import com.example.demo.dto.CalcRequest;
import com.example.demo.service.CalcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class StrategyController {

    private final CalcService service;

    @PostMapping("/calc")
    public int getResult(@RequestBody @Valid CalcRequest calcRequest) {
        String oper = calcRequest.getOper();
        int x = calcRequest.getX();
        int y = calcRequest.getY();

        return service.resolve(oper).execute(x, y);
    }
}
