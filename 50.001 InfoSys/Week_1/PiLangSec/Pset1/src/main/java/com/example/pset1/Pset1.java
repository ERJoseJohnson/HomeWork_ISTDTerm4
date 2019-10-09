package com.example.pset1;

public class Pset1 {
    public static boolean isAllCharacterUnique(String sIn){
        for (int i=0; i <sIn.length()-1; i++){
            if (sIn.charAt(i) == sIn.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutation (String sIn1, String sIn2){
        for (int i=0; i< sIn1.length(); i++){
            char temp = sIn1.charAt(i);
            if(!sIn2.contains(Character.toString(temp))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
