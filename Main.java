// STUDENT NAME:
// DATE: 

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
        int bdayMonth, bdayDay, bdayYear;
        int currentMonth, currentDay, currentYear;
        int bdayJdn, currentJdn, finalJdn;
        int y, m, a;
        int yearsOld;
		/***** INITIALIZATION SECTION *****/
		bdayMonth = 8;
        bdayDay = 26;
        bdayYear = 1918;

        currentMonth = 2;
        currentDay = 2;
        currentYear = 2020;
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
        a = (14 - currentMonth) / 12;
        y = currentYear + 4800 - a;
        m = currentMonth + (12 * a) - 3;
        currentJdn = currentDay + (153 * m + 2) / 5 + (365 * y) + (y / 4) - (y / 100) + (y / 400) - 32045;

        a = (14 - bdayMonth) / 12;
        y = bdayYear + 4800 - a;
        m = bdayMonth + (12 * a) - 3;
        bdayJdn = bdayDay + (153 * m + 2) / 5 + (365 * y) + (y / 4) - (y / 100) + (y / 400) - 32045;

        finalJdn = currentJdn - bdayJdn;
        yearsOld = finalJdn / 365;

		/***** OUTPUT SECTION *****/
        System.out.println("Julian Day Number for today's date, " + currentMonth + "/" + currentDay + "/" + currentYear + ", is " + currentJdn);
        System.out.println("Julian Day Number for birthday, " + bdayMonth + "/" + bdayDay + "/" + bdayYear + ", is " + bdayJdn);
        System.out.println("The difference in days is " + finalJdn + ", which makes you approximately " + yearsOld + " years old!");

    }
}