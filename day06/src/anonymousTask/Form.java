package anonymousTask;

public interface Form {	//본사에 제출할 양식
	//지점을 오픈하기 전 본사에 제출할 메뉴판
	public String[] getMenu();
	public void sell(String order);
}