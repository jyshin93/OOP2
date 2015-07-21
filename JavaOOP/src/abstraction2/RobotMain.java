package abstraction2;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 GunRobot
		 ShieldRobot을 만들어라
		 
		 출력
		 건로봇은 속도는 10, 에너지는 10, 공격력은 50
		 - 공격력은 인스턴스 변수로 int attackPoint
		 쉴드로봇은 속도는 20, 에너지는 20, 방어력은 50
		 - 방어력은 인스턴스 변수로 int shieldPoint
		 
		 * */
		GunRobot gunRobot = new GunRobot();
		gunRobot.attack(50);
		gunRobot.charge(10);
		gunRobot.run(10);
		ShieldRobot shieldRobot = new ShieldRobot();
		shieldRobot.shield(50);
		shieldRobot.charge(20);
		shieldRobot.run(20);
		Robot[] bot = new Robot[2];
		bot[0] = gunRobot;
		bot[1] = shieldRobot;
		
		for(Robot robot : bot){
			robot.status();
		}
	}
}
