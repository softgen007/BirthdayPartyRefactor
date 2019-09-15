package scrap.heap.refactor.model;

public class Order {

	private final Cake cake;
	private final Balloon balloon;

	private Order(OrderBuilder builder) {
		this.cake = builder.cake;
		this.balloon = builder.balloon;
	}

	public Cake getCake() {
		return cake;
	}

	public Balloon getBalloon() {
		return balloon;
	}

	public static class OrderBuilder {
		private Cake cake;
		private Balloon balloon;

		public OrderBuilder() {

		}

		public OrderBuilder cake(Cake cake) {
			this.cake = cake;
			return this;
		}

		public OrderBuilder balloon(Balloon balloon) {
			this.balloon = balloon;
			return this;
		}

		public Order build() {
			return new Order(this);
		}
	}
}
