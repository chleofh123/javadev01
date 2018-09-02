package space.co.work;

public class AndroidVersionInfo {
	private String alphabet;
	private String version_name;
	private String version_name_kor;
	private double version;
	private int year;
	public String getAlphabet() {
		return alphabet;
	}
	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}
	public String getVersion_name() {
		return version_name;
	}
	public void setVersion_name(String version_name) {
		this.version_name = version_name;
	}
	public String getVersion_name_kor() {
		return version_name_kor;
	}
	public void setVersion_name_kor(String version_name_kor) {
		this.version_name_kor = version_name_kor;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "alphabet: "+ this.alphabet
				+"\n versionName : " +this.version_name
				+"\n versionNamekor : " + this.version_name_kor
				+"\n version : " + this.version
				+"\n year : " + this.year;
				

	}

}
