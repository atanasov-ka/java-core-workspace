package classes;	

import java.util.Arrays;

public class MaxSumScalar {
	public long sum (int[] arr1, int[] arr2) {
		long result = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			result += arr1[i] * arr2[i];
		}		
		return result;
	}

	public int getNumberOfDigits(int aNumber) {
		aNumber = Math.abs(aNumber);
		int digits = 1;
		int ref = 10;
		while (true) {
			if (aNumber < ref)
				break;
			ref *= 10;
			++digits;
		}
		
		return digits;
	}
	
	public String stichMeUp(String glue, String ... aInputArr) {
		String glued = "";
		if (aInputArr.length == 0)
			return glued;
		
		for (int i = 0; i < aInputArr.length; i++) {
			if (i > 0)
				glued += glue;
			glued += aInputArr[i];
		}
		
		System.out.println(glued);
		return glued;
	}
	
	public String reduceFilePath(String aInput)
    {
        aInput = aInput.replaceAll("(/)/+", "/");  // handling extra '/'
        aInput = aInput.replaceAll("((/|^)\\.)+(/|$)", "/"); // handling '/./' './' and '/.'
        // iterative handling of '/upper_dir/../'
        {
            String result = aInput;
            do
            {
                aInput = result;
                result = aInput.replaceAll("((((^|^/)|(/[A-Za-z0-9 _]*/)))\\.\\.)(/|$)", "/");
            }
            while (result != aInput);
        } // end iterative replacement
 
        aInput = aInput.replaceAll("(?!^^)/$", ""); // final step: removing the last '/' (if any and is not alone)
        return aInput;
    }
	
}
