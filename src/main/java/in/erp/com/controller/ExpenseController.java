package in.erp.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.erp.com.Service.ExpenseService;
import in.erp.com.Service.WhatsAppService;
import in.erp.com.entity.Expense;

@Controller
public class ExpenseController {
	@Autowired
	private ExpenseService service;
	
	@Autowired
	private WhatsAppService wService;

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("expense", new Expense());
        model.addAttribute("expenses", service.getAllExpenses());
        model.addAttribute("totalExpense", service.getTotalExpense());
        return "dashboard";
    }

    @PostMapping("/api/expenses/{userId}")
    public String saveExpense(@ModelAttribute Expense expense) {
        service.saveExpense(expense);
        return "redirect:/dashboard";
    }

    @GetMapping("/reports/daily")
    public String showDailyReport(Model model) {
        model.addAttribute("expenses", service.getDailyExpenses());
        return "report";
    }

    @GetMapping("/reports/weekly")
    public String showWeeklyReport(Model model) {
        model.addAttribute("expenses", service.getWeeklyExpenses());
        return "report";
    }

    @GetMapping("/reports/monthly")
    public String showMonthlyReport(Model model) {
        List<Expense> monthlyExpenses = service.getMonthlyExpenses();
        model.addAttribute("expenses", monthlyExpenses);
        double total = monthlyExpenses.stream().mapToDouble(e -> e.getAmount()).sum();
        wService.sendMonthlyReport(total); // WhatsApp alert
        return "report";
    }
}
	
	


