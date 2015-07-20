package inhabitance;

public class AndroidPhone extends Iphone{
	public static String BRAND = "안드로이드폰";
	private String os;
	private String data;
	@Override
	public String getOs() {
		// super.getOs();
		return os;
	}
	@Override
	public void setOs(String os) {
		this.os = "android";
	}
	@Override
	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.isPortable();
		super.setCall(name);
		//super.setData(name, data);
		this.data = super.getCompany()+"\n" +
					super.getCall()+"\n"+
					this.getOs()+"\n"+
					data + ": 카톡메시지 전달";
	}
	@Override
	public String getData() {
		return data;
	}
}
