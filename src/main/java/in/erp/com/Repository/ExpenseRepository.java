package in.erp.com.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.erp.com.entity.Expense;
import in.erp.com.entity.User;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	List<Expense> findByDate(LocalDate date);
    List<Expense> findByDateBetween(LocalDate start, LocalDate end);
 
}
