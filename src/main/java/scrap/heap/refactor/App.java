package scrap.heap.refactor;

import java.util.ArrayList;
import java.util.List;

import scrap.heap.refactor.model.RawOrderItem;
import scrap.heap.refactor.service.OrderProcessor;

public class App {
	public String getGreeting() {
		return "Hello world.";
	}

	public static void main(String[] args) {

		// Place birthday party orders
		List<RawOrderItem> orders = new ArrayList<RawOrderItem>();
		orders.add(new RawOrderItem("red", "mylar", "4", "chocolate", "chocolate", "circle", "large", "brown"));
		orders.add(new RawOrderItem("blue", "latex", "7", "Vanilla", "chocelate", "square", "med", "brown"));
		orders.add(new RawOrderItem("yellow", "mylar", "4", "vanilla", "vanilla", "square", "small", "yellow"));

		OrderProcessor orderProcessor = new OrderProcessor();
		orderProcessor.processOrders(orders);

	}

}
