package in.erp.com.Service;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.erp.com.Repository.ExpenseRepository;
import in.erp.com.Repository.UserRepository;
import in.erp.com.entity.Expense;
import in.erp.com.entity.User;

@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository repo;
	
	   public void saveExpense(Expense expense) {
	        repo.save(expense);
	    }

	    public List<Expense> getAllExpenses() {
	        return repo.findAll();
	    }

	    public double getTotalExpense() {
	        return repo.findAll().stream().mapToDouble(Expense::getAmount).sum();
	    }

	    public List<Expense> getDailyExpenses() {
	        return repo.findByDate(LocalDate.now());
	    }

	    public List<Expense> getWeeklyExpenses() {
	        LocalDate today = LocalDate.now();
	        LocalDate startOfWeek = today.with(WeekFields.of(Locale.getDefault()).getFirstDayOfWeek());
	        return repo.findByDateBetween(startOfWeek, today);
	    }

	    public List<Expense> getMonthlyExpenses() {
	        LocalDate today = LocalDate.now();
	        LocalDate startOfMonth = today.withDayOfMonth(1);
	        return repo.findByDateBetween(startOfMonth, today);
	    }
	}
	
	

