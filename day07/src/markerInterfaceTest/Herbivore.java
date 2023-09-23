package markerInterfaceTest;

public interface Herbivore {
	default void checkKinds() {
		System.out.println("육식동물 입니다.");
	}
}
