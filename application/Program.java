package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		///pendente fazer o To String de OrderItem e CLiente

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("----Enter Client data----");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth Date (dd/mm/yyyy): ");
		Date birthDate = sdf.parse(sc.next());


		Client client = new Client(name, email, birthDate);


		System.out.println("----Enter Order data----");
		System.out.print("Order Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());



		Order order = new Order(new Date(), status, client);

		System.out.print("How many itens in this order? ");
		Integer qty = Integer.parseInt(sc.next());
		

		for (int i = 1; i <= qty; i++) {


			System.out.println("Enter #" + i + " Iem Data");
			System.out.print("Product name: ");
			String pname = sc.next();

			System.out.print("Product price: ");
			Double price = Double.parseDouble(sc.next());

			System.out.print("Product quantity: ");
			Integer pqty = Integer.parseInt(sc.next());

			Product product = new Product(pname, price);

			OrderItem orderitem = new OrderItem(pqty, price, product);
			
			order.addItem(orderitem);
			
			
			
		}	

		System.out.println("//// \n Order Summary/////");
		System.out.println(order);
		
		
		sc.close();

	}

}
