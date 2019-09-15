package scrap.heap.refactor.model;

public class Balloon {

	private final String color;
	private final String material;
	private final int number;

	private Balloon(BalloonBuilder builder) {
		this.color = builder.color;
		this.material = builder.material;
		this.number = builder.number;
	}

	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return this.color + ", " + this.material + ", " + this.number;
	}

	public static class BalloonBuilder {
		private String color;
		private String material;
		private int number;

		public BalloonBuilder(int number) {

			this.number = number;
		}

		public BalloonBuilder color(String color) {
			this.color = color;
			return this;
		}

		public BalloonBuilder material(String material) {
			this.material = material;
			return this;
		}

		public Balloon build() {
			return new Balloon(this);
		}
	}
}
