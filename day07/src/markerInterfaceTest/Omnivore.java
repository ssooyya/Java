package markerInterfaceTest;

public interface Omnivore {
	default void checkKinds() {
		System.out.println("잡식동물 입니다.");
	}
}
