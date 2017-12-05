import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	Email email1 = new Email(true, "free");
	Email email2 = new Email(true, "free");
	Email email3 = new Email(true, "free");
	Email email4 = new Email(false, "free");
	Email email5 = new Email(false, "live");
	Email email6 = new Email(false, "live");
	Email email7 = new Email(false, "live");
	Email email8 = new Email(true, "live");
	Email email9 = new Email(false, "live");
	Email email10 = new Email(false, "live");
	//make emails for test
	//add emails to list
	ArrayList<Email> allEmails = new ArrayList<Email>();
	allEmails.add(email1);
	allEmails.add(email2);
	allEmails.add(email3);
	allEmails.add(email4);
	allEmails.add(email5);
	allEmails.add(email5);
	allEmails.add(email6);
	allEmails.add(email7);
	allEmails.add(email8);
	allEmails.add(email9);
	allEmails.add(email10);
	//now do stuff with it
	
	
	}
	private static double getSpamPercentWithFree(ArrayList<Email> allEmails)
	{
		double percentWithSpamAndFree = 0;
		for(Email email : allEmails)
		{
			if(email.isSpam() && email.getWordsContained().equals("free"))
			{
				percentWithSpamAndFree++;
			}
		}
		percentWithSpamAndFree = percentWithSpamAndFree / allEmails.size();
		return percentWithSpamAndFree;
	}
	private static double getPercentSpam(ArrayList<Email> allEmails)
	{
		double percentWithSpam = 0;
		for(Email email : allEmails)
		{
			if(email.isSpam())
			{
				percentWithSpam++;
			}
		}
		percentWithSpam = percentWithSpam / allEmails.size();
		return percentWithSpam;
	}

}
