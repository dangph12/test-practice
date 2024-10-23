package org.dangph12.testpractice;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculationCommission {
    @GetMapping("")
    public String home(){
        return "index";
    }

    @PostMapping("/calc")
    public String calculationCommission(HttpServletRequest request, Model model){
        String customer = request.getParameter("customer");
        return "index";
    }
}
