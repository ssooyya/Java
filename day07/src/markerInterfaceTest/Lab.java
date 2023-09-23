package markerInterfaceTest;

public class Lab {
	//외부에서 모든 동물을 받아와서
	//초식동물인지 육식동물인지 잡식동물인지 구분하는 메소드를 작성해보자.
	//초식동물 : Herbivore
	//육식동물 : Carnivore
	//잡식 동물 : Omnivore
	public void checkKinds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Herbivore) {
				System.out.println(i + 1 + "번째는 초식동물");
			}
			else if(animals[i] instanceof Carnivore) {
				System.out.println(i + 1 + "번째는 육식동물");
			}else {
				System.out.println(i + 1 + "번째는 잡식동물");
			}
		}
	}
	public static void main(String[] args) {
		//테스트
		Lab l = new Lab();
		
		Animal[] animals = {
				new Cow(),
				new Panguin(),
				new Panda(),
				new Tiger()
		};
		
		l.checkKinds(animals);
	}
}
