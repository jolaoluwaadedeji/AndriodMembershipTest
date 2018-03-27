public class NumericInput extends TextInput {

    public void add(char c)
    {
        if (checkInput(c))
        {
            super.value += c;
        }
    }
    public Boolean checkInput(char c) {

        try {

                char[] defaultValues = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

                int length = defaultValues.length;

                for (int i = 0; i < length; i++) {

                    if (c == defaultValues[i]) {

                    return true;
                }
            }

            return false;
        }
        catch (Exception ex){

            throw ex;
        }
    }

}
