package com.pluralsight;

public class HomePage {
    static String url="https://demo.potomac.io/login";
    static String title="Login" ;

    public void goTo(){
        Browser.goTo(url);
    }

    public boolean isAt(){
        return Browser.title().equals(title);
    }
}
