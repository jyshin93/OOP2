package abstraction2;

public class GunRobot extends BasicBot{
	private int attackPoint;
	
	@Override
	public void charge(int energy) {
		super.charge(energy);
	}
	@Override
	public void run(int speed) {
		super.run(speed);
	}
	public void attack(int attackPoint){
		this.attackPoint = attackPoint;
	}
	@Override
	public void status() {
		System.out.println("===건로봇===");
		super.status();
		System.out.println("공격력은 :"+this.attackPoint);
	}
}
