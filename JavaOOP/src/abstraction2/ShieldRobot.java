package abstraction2;

public class ShieldRobot extends BasicBot {
	private int shieldPoint;
	public void shield(int shieldPoint){
		this.shieldPoint = shieldPoint;
	}
	@Override
	public void charge(int energy) {
		super.charge(energy);
	}
	@Override
	public void run(int speed) {
		super.run(speed);
	}
	@Override
	public void status() {
		System.out.println("===쉴드봇===");
		super.status();
		System.out.println("방어력은 :" +this.shieldPoint);
	}
}
