public class Palindrome {

    public  boolean PalindromeChecker(String initialValue)
    {
        try {
            int length = initialValue.length();

            StringBuilder reversedValue = new StringBuilder("");

            for (int i = length - 1; i >= 0; i--) {

                reversedValue.append(initialValue.charAt(i));
            }

            if (initialValue.toLowerCase() == reversedValue.toString().toLowerCase()) {
                return true;
            }

            else {
                return false;
            }
        }
        catch (Exception ex){
            throw ex;
        }
    }
}

