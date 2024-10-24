package org.dangph12.testpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CommissionController {
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("order", new Order());
        model.addAttribute("commission", 0);
        return "index";
    }

    @PostMapping("")
    public String calculateCommission(@ModelAttribute Order order, Model model){
        CommissionService commissionService = new CommissionService();
        int commission = commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount());
        model.addAttribute("order", order);
        model.addAttribute("commission", commission);
        return "index";
    }
}
