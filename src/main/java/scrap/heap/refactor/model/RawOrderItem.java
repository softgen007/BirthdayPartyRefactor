package scrap.heap.refactor.model;

public class RawOrderItem {

	public String balloonColor;
	public String material;
	public String number;
	public String frostingFlavor;
	public String flavor;
	public String shape;
	public String size;
	public String cakeColor;

	public RawOrderItem(String balloonColor, String material, String number, String frostingFlavor, String flavor,
			String shape, String size, String cakeColor) {
		this.balloonColor = balloonColor;
		this.material = material;
		this.number = number;
		this.frostingFlavor = frostingFlavor;
		this.flavor = flavor;
		this.shape = shape;
		this.size = size;
		this.cakeColor = cakeColor;
	}

	public String getBalloonColor() {
		return balloonColor;
	}

	public void setBalloonColor(String balloonColor) {
		this.balloonColor = balloonColor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFrostingFlavor() {
		return frostingFlavor;
	}

	public void setFrostingFlavor(String frostingFlavor) {
		this.frostingFlavor = frostingFlavor;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCakeColor() {
		return cakeColor;
	}

	public void setCakeColor(String cakeColor) {
		this.cakeColor = cakeColor;
	}

}
