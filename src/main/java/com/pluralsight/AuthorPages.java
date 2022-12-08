package com.pluralsight;

public class AuthorPages {

    static String url="https://demo.potomac.io/forgot_password";
    static String title="Forgot Password" ;

    public void goTo(){
        Browser.goTo(url);
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
}
