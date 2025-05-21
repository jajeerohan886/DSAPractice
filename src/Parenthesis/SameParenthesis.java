package Parenthesis;

public class SameParenthesis {

    public boolean checkValidityOfParanthesis(String parenthesis) {

        int counter = 0;
        for(int i=0;i<parenthesis.length();i++) {
            if(parenthesis.charAt(i) == '(') {
                counter++;
            } else if(parenthesis.charAt(i) == ')') {
                counter--;
                if(counter < 0) {
                    return false;
                }
            }
        }
        return counter==0;
    }

    public static void main(String[] args) {
        SameParenthesis sameValidParenthesis = new SameParenthesis();

        String parenthesis = "(()()()()()())";

        boolean validParenthesis = sameValidParenthesis.checkValidityOfParanthesis(parenthesis);

        if(validParenthesis) {
            System.out.println("Parenthesis are valid");
        } else {
            System.out.println("Parenthesis are not Valid");
        }
    }
}
