
public class Main {
	public static void main(String[] args) {
		String country = "US FR JP".substring(3, 5);
		String currency = switch (country); {
			case "US": yield "USD";
			case "DE", "FR": yield "EUR";
			case "JP": yield "JPY";
			case "UK": yield "GBP";
		};
		System.out.println(currency);
	}
}
　