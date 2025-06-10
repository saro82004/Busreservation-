package Busres;

public class Bus {
	private int busNo;   //instance variable are private
	private boolean ac;
	private int capacity;  //use get and set for access public
	
	Bus(int no,boolean ac,int cap){   //constructor method
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	//accessor method
	public int getCapacity() { //no arguments but it have return type
		return capacity;
	}
	//mutator
	public void setCapacity(int cap) {//arguments pass can't return type
		capacity=cap;
	}
	
	public int getBusNo() {
		return busNo;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac=ac;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus no: "+busNo+" Ac: "+ac+" "
				+ "Total Capacity: "+capacity);
	}

}
