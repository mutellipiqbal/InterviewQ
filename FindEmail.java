package javaQ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindEmail {

    public static void main(String[] args) {

        String input= "Example of valid emails: info@softuni-bulgaria.org, kiki@hotmail.co.uk, no-reply@github.com, s.peterson@mail.uu.net, info-bg@software-university.software.academy.";
        Pattern pattern = Pattern.compile("([a-z0-9_.-]+)@([a-z0-9_.-]+[a-z])");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
