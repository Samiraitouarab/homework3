package codeLabexercise20760;

public class Value {
	
	private boolean modified = false ;
	private int val = 0 ;

	public Value(int val) {
		this.val=val;
	}
	public int getValue() {
		System.out.println("The val= "+val);
		return val;
		
	}
	public void setValue(int val) {
		this.val=val;
		this.modified = true;
	}
	public boolean wasModified() {
		if (this.modified==true) {
			System.out.println(modified);
			return true;
		}else
			
			return false;
	}
	
	}
	

