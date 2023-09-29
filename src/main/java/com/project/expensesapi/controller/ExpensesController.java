package com.project.expensesapi.controller;

import com.project.expensesapi.data.ExpenseDTO;
import com.project.expensesapi.data.ExpensesResponseDTO;
import com.project.expensesapi.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@Validated
@RequestMapping("/expenses")
public class ExpensesController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ExpenseDTO createProduct(@RequestBody @Valid final ExpenseDTO request) {
        return this.expenseService.createExpense(request);
    }

    @GetMapping
    public List<ExpensesResponseDTO> getExpenses
            (@RequestParam(value = "month", required = false, defaultValue = "") String month,
             @RequestParam(value = "type", required = false, defaultValue = "") String type) {
        return this.expenseService.getExpenses(month, type);
    }

}
