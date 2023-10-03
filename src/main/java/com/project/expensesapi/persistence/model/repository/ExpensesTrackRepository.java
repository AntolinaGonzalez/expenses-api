package com.project.expensesapi.persistence.model.repository;

import com.project.expensesapi.persistence.model.ExpensesTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ExpensesTrackRepository extends JpaRepository<ExpensesTrack, Long> {
    @Query(value = "SELECT et FROM ExpensesTrack et WHERE et.type =:type")
    List<ExpensesTrack> getExpensesTrackByType(@Param("type") final String type);

    @Query(value = "SELECT et FROM ExpensesTrack et WHERE EXTRACT(MONTH FROM et.createDate) =:month")
    List<ExpensesTrack> getExpensesTrackByMonth(@Param("month") final String month);

    @Query(value = "SELECT et FROM ExpensesTrack et WHERE EXTRACT(MONTH FROM et.createDate) =:month AND et.type =:type")
    List<ExpensesTrack> getExpensesTrackByTypeAndMonth(@Param("type") final String type,@Param("month") final String month);
}