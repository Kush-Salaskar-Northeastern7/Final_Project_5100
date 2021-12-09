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
     public static boolean validateName(String name) {
        String RegexPattern = "^[a-zA-Z ]{3,20}$";
        Pattern textPattern = Pattern.compile(RegexPattern);
        Matcher match = textPattern.matcher(name);
        return match.matches();
    }
     
    public static boolean validateUsername(String name) {
        String RegexPattern = "^[a-zA-Z]$";
        Pattern textPattern = Pattern.compile(RegexPattern);
        Matcher match = textPattern.matcher(name);
        return match.matches();
    }
    
    public static boolean validatePassword(String name) {
        String RegexPattern = "^[a-zA-Z]$";
        Pattern textPattern = Pattern.compile(RegexPattern);
        Matcher match = textPattern.matcher(name);
        return match.matches();
    }
}
