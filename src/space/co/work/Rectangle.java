package space.co.work;

/**
 * @author CHOI
 *
 */
public class Rectangle {
	private int width;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width > 0){
		this.width = width;
		}else {
			System.out.println("0���� ū ���� �Է� �� �ּ���. ");
		}
	}

	public int calc(){
		int result = this.width * this.width;
		return result;
	}	
}
