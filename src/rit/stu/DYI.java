package rit.stu;

import rit.cs.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DYI {

    /**
     * Parse user input until quit
     * @param args
     */
    public void interpreter(){
        System.out.println("Derp Your Interpreter v1.0 :)");
        System.out.print("> ");
        //prompt user
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userList = new ArrayList<String>(Arrays.asList(scanner.nextLine().split(" ")));
        while (userList.get(0) != "quit") {
            Expression type = parse(userList);
            System.out.println("Emit: " + type.emit());
            System.out.println("Evaluate: " + type.evaluate());
            System.out.print("> ");
            //infinity loop
            userList = new ArrayList<String>(Arrays.asList(scanner.nextLine().split(" ")));
        }
    }

    /**
     * builds parse tree recursively using any implemented expression
     * @param args
     */
    public Expression parse( ArrayList<String> tokens){
        String first = tokens.get(0);
        tokens.remove(0);
        if (first.equals("+")){
            return new AddExpression(parse(tokens), parse(tokens));
        }
        else if (first.equals("/")){
            return new DivExpression(parse(tokens), parse(tokens));
        }
        else if (first.equals("%")) {
            return new ModExpression(parse(tokens), parse(tokens));
        }
        else if (first.equals("*")) {
            return new MulExpression(parse(tokens), parse(tokens));
        }
        else if (first.equals("-")) {
            return new SubExpression(parse(tokens), parse(tokens));
        }
        else{
            return new IntExpression(Integer.parseInt(first));
        }
    }

    /**
     * create a DYI instance and then pass control to interpreter method
     * @param args
     */
    public static void main(String[] args) {
        DYI token = new DYI();
        token.interpreter();
    }
}
