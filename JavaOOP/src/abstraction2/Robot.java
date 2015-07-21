package abstraction2;

public interface Robot {
	/*
	 로봇이 공격하는 기능
	 * */
	public void charge(int energy); //공격
	/*
	 로봇이 움직이는 기능
	 * */
	public void run(int spped);
	/*
	 로봇의 상태 모니터링
	 * */
	public void status();
}
