import java.util.Scanner;

public class Restaurant {

	int Pizza;
	int Burger;
	int French_Fries;
	int Cold_Drink;
	
	int p, b, f, c;
	
	double price1, price2, price3, price4, TotalPrice=0;
	
	static Scanner sc = new Scanner(System.in);
	
	void pizza_quantity() {
		System.out.print("If you want Pizza PRESS 1:-");
		p=sc.nextInt();
		
		if(p==1) {
			//Asking user to input Pizza's quantities
			System.out.print("How many Pizza's you want?:");
			Pizza = sc.nextInt();
			
			price1=(Pizza*150);
			
			System.out.println("\n\t**************************************************");
			System.out.print("\n\t\t"+Pizza+" Pizza's price is: "+price1);
		}else if(p==0) {
			System.out.println("\tDon't want Pizza !!!");
	}else {
		System.out.println("Please Enter 0/1 only !!!");
	}
	System.out.println("\n\t**************************************************\n");
}
	
	
	void burger_quantity() {
		System.out.print("If you want Burger PRESS 1:-");
		b=sc.nextInt();
		
		if(b==1) {
			//Asking user to input Burger's quantities
			System.out.print("How many Burger's you want?:");
			 Burger = sc.nextInt();
			
			price2=(Burger*80);
			System.out.println("\n\t**************************************************");
			System.out.print("\n\t\t"+ Burger+"  Burger's price is: "+price2);
		}else if(b==0) {
			System.out.println("\tDon't want  Burger !!!");
	}else {
		System.out.println("Please Enter 0/1 only !!!");
	}
	System.out.println("\n\t**************************************************\n");
}
	
	void French_Fries_quantity() {
		
		System.out.print("If you want French Fries PRESS 1:-");
		f=sc.nextInt();
		
		if(f==1) {
			//Asking user to input French Fries quantities
			System.out.print("How many French Fries pack you want?:");
			French_Fries = sc.nextInt();
			
			price3=( French_Fries*30);
			System.out.println("\n\t**************************************************");
			System.out.print("\n\t\t"+ French_Fries+"  French_Fries price is: "+price3);
		}else if(f==0) {
			System.out.println("\tDon't want  French_Fries !!!");
	}else {
		System.out.println("Please Enter 0/1 only !!!");
	}
	System.out.println("\n\t**************************************************\n");
}
	
	
	void ColdDrink_quantity() {
		
		System.out.print("If you want Cold_Drink PRESS 1:-");
		c=sc.nextInt();
		
		if(c==1) {
			//Asking user to input coldDrinks quantities
			System.out.print("How many Cold_Drink's you want?:");
			Cold_Drink = sc.nextInt();
			
			price4=( Cold_Drink*50);
			
			System.out.println("\n\t**************************************************");
			System.out.print("\n\t\t"+ Cold_Drink+"  Cold_Drink's price is: "+price4);
		}else if(c==0) {
			System.out.println("\tDon't want  Cold_Drink !!!");
	}else {
		System.out.println("Please Enter 0/1 only !!!");
	}
	System.out.println("\n\t**************************************************\n");
}
	
void total_price() {
		
		TotalPrice=(price1+price2+price3+price4);
		System.out.println();
		System.out.println("\t-----------------------------------------------");
		System.out.println("\tItems\t\t\tQuantity\tPrice");
		System.out.println("\t-----------------------------------------------");
		System.out.println("\tPizza "+"\t\t\t"+Pizza+"\t\t"+price1+"\t");
		System.out.println("\tBurger "+"\t\t\t"+Burger+"\t\t"+price2+"\t");
		System.out.println("\tFrench_Fries "+"\t\t"+French_Fries+"\t\t"+price3+"\t");
		System.out.println("\tCold_Drink "+"\t\t"+Cold_Drink+"\t\t"+price4+"\t");
		System.out.println("\t===============================================");
		
		System.out.println("\n\tTotal payable amount:-\t\t\t"+TotalPrice);
		System.out.println("\t|||||||||||||||||||||||||||||||||||||||||||");
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("\n\t***********Welcome to FoodOFast***********\n");
		System.out.println("Please select any food item you want: \n");
		System.out.println("\t1.Pizza");
		System.out.println("\t2.Burger");
		System.out.println("\t3.FrenchFries");
		System.out.println("\t4.ColdDrink");
		System.out.print("\nPlease Enter Your choice here:-");
		
		Restaurant rs = new Restaurant();
		
		for(int i=1;i<=5;i++) {
			int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			rs.pizza_quantity();
			System.out.print("To Add another item enter the choice OR To print bill press (5):-");
		
			break;
			
		case 2:
			rs.burger_quantity();
			System.out.print("To Add another item enter the choice OR To print bill press (5):- ");
			
			break;
		
		case 3:
			rs.French_Fries_quantity();
			System.out.print("To Add another item enter the choice OR To print bill press (5):-");
			
			break;
			
		case 4:
			rs.ColdDrink_quantity();
			System.out.print("To Add another item enter the choice OR To print bill press (5):- ");
			
			break;
			
		case 5:
			rs.total_price();
			break;
			
			default:
				System.out.println("Please enter valid choice");
				break;
		}
		
	}
		
		System.out.println("\tSelect mode of payment: ");
		System.out.println("\t**********************");
		System.out.println("\t1.Cash");
		System.out.println("\t2.UPI");
		System.out.println("\t3.Card");
		System.out.println("\t**********************");
		System.out.print("\tYour choce: ");

		int pay = sc.nextInt();
		
		if(pay==1) {
			System.out.println("Payment succeful by CASH");
		}else if(pay==2)
		{
			System.out.println("Payment successful by UPI");
		}else if(pay==3) {
			System.out.println("Payment successful by CARD");
		}else {
			System.out.println("Please select valid payment method!!!");
		}
		System.out.println("\n\n\t\t # Thank You Visit Again #");
 }
	
}


