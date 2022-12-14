package com.example.controller;

import com.example.common.CommonResult;
import com.example.service.CalculatorService;
import com.example.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Seyyu
 * @version 1.0
 * @date 2022-9-10
 */

@Tag(name = "计算接口", description = "CalculatorController")
@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @Operation(summary = "获取计算结果")
    @GetMapping("/index")
    @ResponseBody
    public CommonResult selectUserList(){
        return calculatorService.calculator();
    }
}
