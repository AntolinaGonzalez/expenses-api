package com.project.expensesapi.service;

import com.project.expensesapi.data.ExpenseDTO;
import com.project.expensesapi.mapper.ExpenseMapper;
import com.project.expensesapi.persistence.model.ExpensesTrack;
import com.project.expensesapi.persistence.model.repository.ExpensesTrackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseService {
    @Autowired
    private ExpenseMapper expenseMapper;
    @Autowired
    private ExpensesTrackRepository expensesTrackRepository;

    public ExpenseDTO createExpense(final ExpenseDTO expenseDTO) {
        ExpensesTrack expensesTrack = this.expenseMapper.mapToExpenseTrack(expenseDTO);
        this.expensesTrackRepository.save(expensesTrack);
        return expenseDTO;
    }
}
