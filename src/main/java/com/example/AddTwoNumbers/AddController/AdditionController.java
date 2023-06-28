package com.example.AddTwoNumbers.AddController;

import com.example.AddTwoNumbers.utility.AdditionUtility;
import org.springframework.ui.Model;
import com.example.AddTwoNumbers.domain.Addition;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/calculator")
@Controller
public class AdditionController
{
    AdditionUtility additionUtility;
    @PostMapping("/add")
    @ResponseBody
    public Addition addNumbers(@RequestParam("a") int a, @RequestParam("b") int b)
    {
        return new Addition(a, b, additionUtility.add(a, b));
    }
}