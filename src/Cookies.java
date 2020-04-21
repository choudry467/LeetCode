import java.util.Scanner;

public class Cookies {
	private double flour;
	private double butter;
	private double eggs;
	private double sugar;
	
	public Cookies() {
		this.flour = 0;
		this.butter = 0;
		this.eggs = 0;
		this.sugar = 0;	
	}
	
	public void buyIngredients() {
		flour += 2;
		butter += 2;
		eggs += 2;
		sugar += 2;
		System.out.println("Tanya bought some ingredients to make cookies.");
	}
	
	public boolean bake(int num) {
		
		if( (flour >= num*2.5) && (butter >= num*0.5) && (eggs >= num) && (sugar >= num*2)) {
			flour -= 2.5;
			butter -= 0.5;
			eggs -= 1;
			sugar -= 2;
			return true;
		}
		else
			return false;
	}
	
	public String toString() {
		String display;
		display = "Flour: "+flour+"\n"+"Eggs: "+eggs+"\n"+"Sugar: "+sugar+"\n"+"Butter: "+butter;
		return display;
	}
}

class TestCookies {

	public static void main(String[] args) {
		int loop = 1;
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		Cookies tanya= new Cookies();
		
		while (loop ==1) {
			tanya.buyIngredients();
			System.out.println("How many batches of cookies do you want from Tanya?");
			int num = input.nextInt();
			
			if (tanya.bake(num)) {
				System.out.println("Here are your cookies!");
			}else {
				System.out.println("Sorry, not enough ingredients."+"\n");
				System.out.println("Ingredients available:");
				System.out.println(tanya.toString()+"\n");
			}
			
			System.out.println("Would you like to try again? (Enter 1 for yes, 0 for no)");
			loop = input.nextInt();
		}
	}

}
