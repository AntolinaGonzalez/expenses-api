package com.project.expensesapi.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseDTO {
    @NotNull
    private ExpenseType type;
    private float amount;
    private String description;
}

