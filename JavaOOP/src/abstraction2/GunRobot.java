package abstraction2;

public class GunRobot extends BasicBot{
	private int attackPoint;
	
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	@Override
	public void status() {
		System.out.println("===건로봇===");
		super.status();
		System.out.println("공격력은 :"+this.attackPoint);
	}
}
