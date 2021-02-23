
public class Enum {
	public static void main(String[] args) {
		System.out.println(Dessert.APPLE.name());
		//列強した順序をint型で返す
		System.out.println(Dessert.APPLE.ordinal());
		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CAKE.ordinal());
	}
}
