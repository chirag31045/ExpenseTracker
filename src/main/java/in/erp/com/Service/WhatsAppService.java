package in.erp.com.Service;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class WhatsAppService {
	private final String ACCOUNT_SID="AC50489c4715cf94fda16b3a3d5a27ee96";
	private final String AUTH_TOKEN="92dbe0a610d812cf7d813d714c8f9a14";
	private final String FROM_NUMBER="whatsapp:+14155238886";
	private final String TO_NUMBER="whatsapp:+918442070655";
	
    public void sendMonthlyReport(double totalExpense) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String body = "Monthly Expense Report: ₹" + totalExpense;

        Message message = Message.creator(
                new PhoneNumber(TO_NUMBER),
                new PhoneNumber(FROM_NUMBER),
                body
        ).create();
    }


}
