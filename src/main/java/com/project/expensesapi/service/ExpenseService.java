package com.project.expensesapi.service;

import com.project.expensesapi.data.ExpenseDTO;
import com.project.expensesapi.data.ExpenseType;
import com.project.expensesapi.data.ExpensesResponseDTO;
import com.project.expensesapi.mapper.ExpenseMapper;
import com.project.expensesapi.persistence.model.ExpensesTrack;
import com.project.expensesapi.persistence.model.repository.ExpensesTrackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public List<ExpensesResponseDTO> getExpenses() {
        List<ExpensesTrack> expensesTracks=  this.expensesTrackRepository.findAll();
        List<ExpensesResponseDTO> expensesResponseDTOS =  new ArrayList<>(expensesTracks.size());
        if (!expensesTracks.isEmpty()) {
            for (ExpensesTrack expensesTrack : expensesTracks) {
                ExpensesResponseDTO expensesResponseDTO = new ExpensesResponseDTO();
                expensesResponseDTO.setDescription(expensesTrack.getDescription());
                expensesResponseDTO.setType(ExpenseType.valueOf(expensesTrack.getType()));
                expensesResponseDTO.setAmount(Float.parseFloat(expensesTrack.getAmount()));
                expensesResponseDTO.setCreateDate(Date.from(expensesTrack.getCreateDate()));
                expensesResponseDTOS.add(expensesResponseDTO);
            }
        }
        return expensesResponseDTOS;
    }
}
