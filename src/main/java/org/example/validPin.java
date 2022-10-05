package org.example;

public class validPin {
    public static boolean validPin(String pin){
        int passL = pin.length();

        if(passL != 4 && passL != 6){
            return false;
        }
            try {
                double num = Double.parseDouble(pin);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }
    }
