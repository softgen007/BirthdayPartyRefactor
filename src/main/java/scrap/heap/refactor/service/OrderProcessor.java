package scrap.heap.refactor.service;

import java.util.List;

import scrap.heap.refactor.exception.OrderException;
import scrap.heap.refactor.model.Balloon;
import scrap.heap.refactor.model.Cake;
import scrap.heap.refactor.model.Order;
import scrap.heap.refactor.model.RawOrderItem;

public class OrderProcessor {

	public void processOrders(List<RawOrderItem> orders) {

		for (int i = 0; i < orders.size(); i++) {
			try {
				RawOrderItem item = orders.get(i);
				if (Integer.valueOf(item.getNumber()) > 0 && !item.getSize().trim().isEmpty()) {
					Order order = new Order.OrderBuilder().cake(new Cake.CakeBuilder(item.size).flavor(item.flavor)
							.frostingFlavor(item.frostingFlavor).shape(item.shape).color(item.cakeColor).build())
							.balloon(new Balloon.BalloonBuilder(Integer.valueOf(item.number)).color(item.balloonColor)
									.material(item.material).build())
							.build();
					System.out.println("Balloons Ordered: " + order.getBalloon().toString());
					System.out.println("Cake Ordered: " + order.getCake().toString());

				} else {
					throw new OrderException("Order #" + (i + 1) + " is invalid",
							"One of the mandatory fields is missing");
				}
			} catch (OrderException e) {
				System.out.println(e.toString());
				continue;
			}

		}

	}
}
