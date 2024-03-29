
package Triviasection;

import LoginSection.*;
import NewsSection.NewsSection;
import PointsSection.PointsShop;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // create an object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        // create an object of login class ( to get the user id )
        Login lg = new Login();
        
        // create an object of register class ( for user to register account )
        Register rg = new Register();
        
        // create an object of news section class ( for display news )
        NewsSection n = new NewsSection();
        
        // create an object of trivia section class
        TriviaSection trivia = new TriviaSection();

        // create an object of previous question class
        PreviousQuestion pq = new PreviousQuestion();
        
        // create an object of checkin class
        CheckIn check = new CheckIn();
        
        // create an object of donations class
        Donation donate = new Donation();
        
        // create an object of points section class
        PointsShop shop = new PointsShop();
        
        // --------------- start the program ------------------- // 
        
        // ask user to login
        System.out.print("Do you already have an account? (Y/N) : ");
        String userRespond = sc.next();
        
        // case 1 : if the user already have an account
        if(userRespond.equals("Y")) {
            lg.Login();
            n.News();
        }
        // case 2 : if user haven't have an account
        else {
            rg.registerAccount();
            System.out.println("You have successfully registered an account!");
            System.out.println("Now login to your account registered just now ~ ");
            lg.Login();
            n.News();
        }
        
        // if the user click on trivia part
        System.out.print("Do you want to answer the question? (Y/N) : ");
        userRespond = sc.next();
        
        if(userRespond.equals("Y")) {
            trivia.playTrivia();   
            
            // ask user if he/she wants to retry the question without a ffecting the points obtained
            System.out.print("Do you want to retry the question? (Y/N) : ");
            userRespond = sc.next();
            if(userRespond.equals("Y")) {
                trivia.playTriviaWithoutAffectingPoints();
            } else {
                System.out.println("Quit");
            }
        }
        else {
            System.out.println("Quit");
        }
        
        // if user click on answer previous question
        System.out.print("Do you want to answer the previous question that you haven't done? (Y/N) : ");
        userRespond = sc.next();
        if(userRespond.equals("Y")) {
            pq.AnswerPreviousQuestion();
        } else {
            System.out.println("quit");
        }
        
        // if user click on see previous question
        System.out.print("Do you want to see the previous question that you have done? (Y/N) : ");
        userRespond = sc.next();
        if(userRespond.equals("Y")) {
            pq.DisplayAnsweredQuestion();
        } else {
            System.out.println("quit");
        }
        
        // if user click on check in
        System.out.print("Do you want to check in today? (Y/N) : ");
        userRespond = sc.next();
        if(userRespond.equals("Y")) {
            check.checkIn();
        } else {
            System.out.println("quit");
        }
        
        // if user click on donation
        System.out.print("Do you want to make a donation? (Y/N) : ");
        userRespond = sc.next();
        if(userRespond.equals("Y")) {
            donate.donate();
        } else {
            System.out.println("quit");
        }
        
        // if user click on points shop
        System.out.print("Do you want to go points shop? (Y/N) : ");
        userRespond = sc.next();
        if(userRespond.equals("Y")) {
            shop.orderMerchandise();
            shop.plantTree();
        } else {
            System.out.println("quit");
        }
    }
}
