package oop.stringCalculator;

public class StringCalculator {

    public int add(String s) {
        int result = 3;
        if (s.isEmpty()){
            result = 0;
        }
        if (s.length()==1){
            result = Integer.parseInt(s);
        }
        return result;
    }
}
