package com.project.expensesapi.data;

import lombok.Data;
import java.util.Date;

@Data
public class ExpensesResponseDTO {
    private Date createDate;
    private ExpenseType type;
    private float amount;
    private String description;

}
