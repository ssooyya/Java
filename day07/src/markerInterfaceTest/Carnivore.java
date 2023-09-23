package markerInterfaceTest;

public interface Carnivore {
	default void checkKinds() {
		System.out.println("초식동물 입니다.");
	}
}
