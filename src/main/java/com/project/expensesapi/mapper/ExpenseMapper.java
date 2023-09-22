package com.project.expensesapi.mapper;
import com.project.expensesapi.data.ExpenseDTO;
import com.project.expensesapi.persistence.model.ExpensesTrack;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.time.Instant;
@Component
@Mapper(componentModel = "spring", imports = Instant.class)
public abstract class ExpenseMapper {
    @Mappings({
            @Mapping(expression = "java(Instant.now())", target = "createDate")
    })
    public abstract ExpensesTrack mapToExpenseTrack(final ExpenseDTO expenseDTO);

}
