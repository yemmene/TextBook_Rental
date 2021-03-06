package textbookrental;


	import java.time.LocalDate;
	import java.util.Date;
	import java.time.Period;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Set;

	public class Alert {

	    private static HashSet<Patron> patron;
	    

	    public ArrayList<Loan> getOverdueLoans() {
	        return getSoonOverdueLoans(Period.ZERO);
	    }

	    public static HashSet<Patron> getPatrons() {
	        return patron;
	    }

	    public static void setPatron(HashSet<Patron> patrons) {
	        Alert.patron = patrons;
	    }

	    public ArrayList<Loan> getSoonOverdueLoans(Period period) {
	        ArrayList<Loan> result = new ArrayList<Loan>();
	        for (Patron patron : patron) {
	             
	                Loan loan = null;
					if (loan.getDateOfLoan().plus(loan.getPeriod()).isAfter(LocalDate.now().minus(period))) {
	                    result.add(loan);
	                }
	            }
	        
	        return result;
	}
	    

	    public ArrayList<Loan> getAllLoans() {
	        Loan loan = null;
			ArrayList<Loan> result = new ArrayList<Loan>();
	        for (Patron patron : patron) {
	             
	                    result.add(loan);
	            }
	        
	        return result;
	    }
	}