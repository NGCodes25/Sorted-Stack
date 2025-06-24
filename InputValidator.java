/**
 * Provides methods to validate user input for the application.
 * 
 */
 public class InputValidator {
    /**
     * Checks if the input is the comand to end the input.
     * 
     * @param input the user input
     * @return true if input is "done" (case-insensitive), otherwise false
     */
    public static boolean isDone(String input){
        //code reuse - utilize the equalsIgnoreCase of the String class to simplify error checking
        return input.equalsIgnoreCase("done");
    }
        
    /**
    * Checks if the input is a valid integer;
    * 
    * @param input the user input
    * @return true if input is a valid integer, false otherwise
     */
    public static boolean isValidInteger(String input){
        try{
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
