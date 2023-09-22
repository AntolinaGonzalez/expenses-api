package com.project.expensesapi.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExpenseDTO {
    private ExpenseType type;
    private float amount;
    private String description;
}

