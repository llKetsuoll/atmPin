package src;
public class Solution {
	
	public static boolean validatePin(String pin) {
        if(pin.length() == 4 && pin.matches("^[0-9]+$") || pin.length() == 6 && pin.matches("^[0-9]+$")) {
        	return true;        
        }
        			
        else
        	return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        System.out.println(validatePin("123456"));
		
	}
	
}
    