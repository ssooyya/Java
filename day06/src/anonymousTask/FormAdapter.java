package anonymousTask;

//Form의 강제성 소멸
public abstract class FormAdapter implements Form{

	@Override
	public abstract String[] getMenu();

	@Override
	public void sell(String order) {;}
}