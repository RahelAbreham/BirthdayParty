package scrap.heap.refactor.model;

public class Balloon {

	private Color balloonColor;
	private String material;
	private int number;
	
	public Balloon() {
	}

	public Balloon(Color balloonColor, String material, int number) {
		this.balloonColor = balloonColor;
		this.material = material;
		this.number = number;
	}

	public Color getBalloonColor() {
		return balloonColor;
	}

	public void setBalloonColor(Color balloonColor) {
		this.balloonColor = balloonColor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
