package ch09_gamelevel_1021;

public class UltimateSkill {
	 private String skillName;
	 private int skillTime;
	 private String sillRange;
	 
	 
	public UltimateSkill(String skillName, int skillTime, String sillRange) {
		super();
		this.skillName = skillName;
		this.skillTime = skillTime;
		this.sillRange = sillRange;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getSkillTime() {
		return skillTime;
	}
	public void setSkillTime(int skillTime) {
		this.skillTime = skillTime;
	}
	public String getSillRange() {
		return sillRange;
	}
	public void setSillRange(String sillRange) {
		this.sillRange = sillRange;
	}
	 
	public void showSkillInfo() {
		System.out.println("필살기 이름 : " + "skillName");
		
		
	}


}
