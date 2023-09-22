package com.project.expensesapi.controller;

import com.project.expensesapi.data.ExpenseDTO;
import com.project.expensesapi.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ExpenseDTO createProduct(@RequestBody final ExpenseDTO request) {
        return this.expenseService.createExpense(request);
    }

}
