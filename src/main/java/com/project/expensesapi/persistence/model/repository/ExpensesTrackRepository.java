package com.project.expensesapi.persistence.model.repository;

import com.project.expensesapi.persistence.model.ExpensesTrack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesTrackRepository extends JpaRepository<ExpensesTrack, Long> {
}