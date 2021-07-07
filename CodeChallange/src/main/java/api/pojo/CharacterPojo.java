package api.pojo;

import java.util.List;

public class CharacterPojo {
	
	private String charId;
	private String name;
	private String birthday;
	private List<Occupations> occupations;
	private String img;
	private String status;
	private String nickname;
	private List<Appearences> appearence;
	private String portrayed;
	private String category;
	private List<BCSAppearence> bcsAppearence;
	
	
	public CharacterPojo() {
		
	}
	
	public List<Appearences> getAppearence() {
		return appearence;
	}
	public void setAppearence(List<Appearences> appearence) {
		this.appearence = appearence;
	}
	public List<BCSAppearence> getBcsAppearence() {
		return bcsAppearence;
	}
	public void setBcsAppearence(List<BCSAppearence> bcsAppearence) {
		this.bcsAppearence = bcsAppearence;
	}
	public List<Occupations> getOccupations() {
		return occupations;
	}
	public void setOccupations(List<Occupations> occupations) {
		this.occupations = occupations;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCharId() {
		return charId;
	}
	public void setCharId(String charId) {
		this.charId = charId;
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPortrayed() {
		return portrayed;
	}
	public void setPortrayed(String portrayed) {
		this.portrayed = portrayed;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	} 

}
