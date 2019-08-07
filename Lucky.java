package test;

public class Lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Lucky";
		char[] freqArray = input.toCharArray();

		boolean isFreq=false;
		for (int i = 0; i < freqArray.length; i++) {
			for (int j = i+1; j < freqArray.length; j++) {
				if(freqArray[i]==freqArray[j])
				{
					isFreq=true;					
					break;
				}
				
			}
		}
		if (isFreq==true)
		{
			System.out.println("Given string is not lucky");
		}
		else
		{
			System.out.println("Given string is lucky");
		}
		
		

	}

}
