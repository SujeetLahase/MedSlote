/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;

import java.util.Random;

public class OTPUtil {
    public static String generateOTP() {
        Random r = new Random();
        return String.valueOf(100000 + r.nextInt(900000));
    }
}
