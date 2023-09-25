package com.project.expensesapi.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class ExpenseDTO {
    @NotNull
    private ExpenseType type;
    private float amount;
    private String description;
}

