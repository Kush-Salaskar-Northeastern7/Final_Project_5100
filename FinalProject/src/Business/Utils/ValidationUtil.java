/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rolwy
 */
public class ValidationUtil {
    // validation function for name
     public static boolean validateName(String name) {
        String RegexPattern = "^[a-zA-Z ]{3,20}$";
        Pattern textPattern = Pattern.compile(RegexPattern);
        Matcher match = textPattern.matcher(name);
        return match.matches();
    }
    
    // validation function for username
    public static boolean validateUsername(String uname) {
        String RegexPattern = "^[a-zA-Z]$";
        Pattern textPattern = Pattern.compile(RegexPattern);
        Matcher match = textPattern.matcher(uname);
        return match.matches();
    }
    
    // validation function for email
    public static boolean emailValidation(String emailid) {
        String RegexPattern = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$*";
        Pattern textPattern = Pattern.compile(RegexPattern);
        Matcher match = textPattern.matcher(emailid);
        return match.matches();
    }
    
//    public static boolean lengthValidation(int digit, String digitlength) {
//        if (digit )
//    }
}
