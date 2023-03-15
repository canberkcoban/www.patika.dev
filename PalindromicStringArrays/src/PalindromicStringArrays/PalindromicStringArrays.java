package PalindromicStringArrays;

public class PalindromicStringArrays {
	
	static boolean isPalindrome(String str) {
        int i = 0;
        int	j = str.length() - 1; //Starts counting or writing from the end
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
            	return false;	
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
        {
            return true;
        }
        else {
        	return false;
        }
    }

    public static void main(String[] args) {
    	System.out.println(isPalindrome("cac"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome2("kaya"));
        System.out.println(isPalindrome("kavak"));
    }

}
