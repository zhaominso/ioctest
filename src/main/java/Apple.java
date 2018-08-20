import org.springframework.stereotype.Component;

/**
 * @author zhaomin
 * @data 18-8-17
 */

@Component
public class Apple {
	private String name;
	private float price;


	Apple() {
		this.name = "apple";
		this.price = 5.5F;
	}

	@Override
	public String toString() {
		return "Apple{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
