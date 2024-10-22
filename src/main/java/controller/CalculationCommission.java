package controller;

import org.springframework.web.bind.annotation.*;

public class CalculationCommission {
    @GetMapping("")
    public String home(){
        return "index";
    }

    @PostMapping("")
    public String calculationCommission(){

        return "index";
    }
}
