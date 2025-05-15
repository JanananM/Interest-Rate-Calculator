import java.text.DecimalFormat;
import java.util.Scanner;

public class Interest {

	private static DecimalFormat df2 = new DecimalFormat(".##");

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double rate = 0;
		int compound;
		double mrate;
		int time;
		double futurevalue;
		double futurevw;
		double end;

		System.out.println("Welcome to the Annuties Calculator for Future Value!");
		// scanner control
		System.out.println("Enter the future value you want for the interest rate");
		futurevw = sc.nextDouble();
		System.out.println("Enter the coumpounded rate. e.g monthly = 12, quaterly = 4");
		compound = sc.nextInt();
		System.out.println("Enter the time in years.");
		time = sc.nextInt();
		System.out.println("Enter the rate you deposit the money (in dollars).");
		mrate = sc.nextDouble();

		for (double lrate = 0.01; lrate <= 20.00; lrate = lrate + 0.0000001) {

			rate = lrate;
			rate = rate / 100;
			double top1;
			double top2;
			top1 = (1 + rate / compound);
			top2 = (time * compound);
			double top3 = (Math.pow(top1, top2));
			double top4 = (top3 - 1);
			double bottom1 = ((rate / compound));
			double bottom2 = (top4 / bottom1);
			futurevalue = (bottom2 * mrate);

			if ((futurevalue >= (futurevw - 0.01)) && (futurevalue >= (futurevw + 0.01))) {
				break;
			}
		}
		end = (rate * 100);
		System.out.print("An interest rate of ");
		System.out.print(df2.format(end));
		System.out.println(" will give the future value of " + futurevw);
	}
}
