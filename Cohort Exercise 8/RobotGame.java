class Robot {
	private String name;
	private IBehaviour behavior;

	public Robot (String name)
	{
		this.name = name;
	}

	public void behave ()
	{	
		System.out.println(name+" executing Command "+behavior.moveCommand()+"...");
		System.out.println(behavior.behDes());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setBehavior(IBehaviour behavior) {
		this.behavior = behavior;
		System.out.println(name+" behaviour set to: "+behavior.getBehaviour());
	}
}

interface IBehaviour {
	public int moveCommand();
	public String behDes();
	public String getBehaviour();
}

class AggressiveBe implements IBehaviour{
	public String behDes(){
		return "Attack!!!!!";
	}

	public int moveCommand(){
		return 1;
	}

	public String getBehaviour(){
		return "Aggressive";
	}
}

class DefensiveBe implements IBehaviour{
	public int moveCommand(){
		return -1;
	}

	public String behDes(){
		return "Draws Sheild";
	} 

	public String getBehaviour(){
		return "Defensive";
	}
}

class NormalBe implements IBehaviour{
	public int moveCommand(){
		return 0;
	}

	public String behDes(){
		return "Beep Boop remaining neutral";
	}

	public String getBehaviour(){
		return "Normal";
	}
}

public class RobotGame {

	public static void main(String[] args) {

		Robot r1 = new Robot("Big Robot");
		Robot r2 = new Robot("George v.2.1");
		Robot r3 = new Robot("R2");

		r1.setBehavior(new AggressiveBe());
		r2.setBehavior(new DefensiveBe());
		r3.setBehavior(new NormalBe());
		
		r1.behave();
		r2.behave();
		r3.behave();

		//change the behaviors of each robot.
		r1.setBehavior(new DefensiveBe());
		r2.setBehavior(new NormalBe());
		r3.setBehavior(new AggressiveBe());
		
		r1.behave();
		r2.behave();
		r3.behave();
	}
}
