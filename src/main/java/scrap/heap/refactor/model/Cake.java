package scrap.heap.refactor.model;

public class Cake {

	private final String frostingFlavor;
	private final String flavor;
	private final String shape;
	private final String size;
	private final String color;

	private Cake(CakeBuilder builder) {
		this.frostingFlavor = builder.frostingFlavor;
		this.flavor = builder.flavor;
		this.shape = builder.shape;
		this.size = builder.size;
		this.color = builder.color;
	}

	public String getFrostingFlavor() {
		return frostingFlavor;
	}

	public String getFlavor() {
		return flavor;
	}

	public String getShape() {
		return shape;
	}

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return this.flavor + ", " + this.frostingFlavor + ", " + this.shape + ", " + this.size + ", " + this.color;
	}

	public static class CakeBuilder {
		private String frostingFlavor;
		private String flavor;
		private String shape;
		private String size;
		private String color;

		public CakeBuilder(String size) {
			this.size = size;
		}

		public CakeBuilder frostingFlavor(String frostingFlavor) {
			this.frostingFlavor = frostingFlavor;
			return this;
		}

		public CakeBuilder flavor(String flavor) {
			this.flavor = flavor;
			return this;
		}

		public CakeBuilder shape(String shape) {
			this.shape = shape;
			return this;
		}

		public CakeBuilder color(String color) {
			this.color = color;
			return this;
		}

		public Cake build() {
			return new Cake(this);
		}
	}

}
