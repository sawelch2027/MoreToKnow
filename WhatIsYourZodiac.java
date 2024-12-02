//Written by: SA Welch

import java.util.Scanner;
public class WhatIsYourZodiac {

	public static void main(String[] args) {
		
		System.out.println("What's your zodiac sign? Let's find out?");
		System.out.println("Enter your birthday starting with month followed by day (mm, dd): ");
		// new scanner is added to ensure that user's input is put through the if statements
		Scanner k = new Scanner(System.in);
		int month = k.nextInt();
		int day = k.nextInt();
		// to ensure that month is analyzed correctly, an if statement is put in place to correctly analyze the right input
		if (!(month <= 12 && month >= 1)) {
			System.out.println("Hey! That's an invalid month!");
		}
		// same is done with the day input
		
		if (month == 2 && !(day>=1 && day<=29)){
			System.out.println("Hey! That's an invalid day!");
		}
		
		else if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
		{
			if (!(day>=1 && day<=30)) {
				System.out.println("Hey! That's an invalid day!");
			}
		}
		else {
			if (!(day>=1 && day<=31)) {
				System.out.println("Hey! That's an invalid day!");
			}
			}
		
		// even though it takes a lot longer... if statements where made for every zodiac sign to ensure valid answers for input
		if (month==3 || month==4) {
			if ((month==3) && (day>=21 && day<=31)) {
				System.out.println("Based on how you type (and your birthday) you are def an Aries!");
			}
			if ((month==4) && (day>=1 && day<=19)) {
				System.out.println("Based on how you type (and your birthday) you are def an Aries!");
			}
		}
		if (month==4 || month==5) {
			if ((month==4) && (day>=20 && day<=30)) {
				System.out.println("Gurl you are SUCH a Taurus!");
			}
			if ((month==5) && (day>=1 && day<=20)) {
				System.out.println("Gurl you are SUCH a Taurus!");
			}
		}
		if (month==5 || month==6) {
			if ((month==5) && (day>=21 && day<=31)) {
				System.out.println("Hate to bring you the bad news but babes...you're a Gemini");
			}
			if ((month==6) && (day>=1 && day<=20)) {
				System.out.println("Hate to bring you the bad news but babes...you're a Gemini");
			}
		}
		if (month== 6 || month== 7) {
			if ((month==6) && (day>=21 && day<=30)) {
				System.out.println("You must like crabs cause you're one of em.....you're a Cancer");
			}
			if ((month==7) && (day>=1 && day<=22)) {
				System.out.println("You must like crabs cause you're one of em.....you're a Cancer");
			}
		}
		if (month== 7 || month== 8) {
			if ((month==7) && (day>=23 && day<=30)) {
				System.out.println("roar like a lion cause you're def a Leo");
			}
			if ((month==8) && (day>=1 && day<=22)){
				System.out.println("roar like a lion cause you're def a Leo");
			}
		}
		if (month== 8 || month== 9) {
			if ((month==8) && (day>=23 && day<=31)) {
				System.out.println("Yeah...ur a virgo");
			}
			if((month==9) && (day>=1 && day<=22)) {
				System.out.println("Yeah...ur a virgo");
			}
		}
		if (month== 9 || month== 10) {
			if ((month==9) && (day>=23 && day<=30)) {
				System.out.println("You're a lady Libra fr");
			}
			if ((month==10) && (day>=1 && day<=22)) {
				System.out.println("You're a lady Libra fr");
			}
		}
		//I also like to add fun little comments to really spice up the code from time to time, gotta have a lil fun.
		if (month== 10 || month== 11) {
			if ((month==10) && (day>=23 && day<=31)) {
				System.out.println("You're a Scorpio...I guess they're okay..");
			}
			if ((month==11) && (day>=1 && day<=21)) {
				System.out.println("You're a Scorpio...I guess they're okay..");
			}
		}
		if (month== 11 || month== 12) {
			if((month==11) && (day>=22 && day<=30)) {
				System.out.println("You're literally the best...You're a Saggitaurus");
			}
			if((month== 12) && (day>=1 && day<=21)) {
				System.out.println("You're literally the best...You're a Saggitaurus");
			}
		}
		if (month== 12 || month== 1) {
			if((month==12) && (day>=22 && day<=31)) {
				System.out.println("ummmm I hate to break this to you but you're a Capricorn...");
			}
			if((month==1) && (day>=1 && day<=19)) {
				System.out.println("ummmm I hate to break this to you but you're a Capricorn...");
			}
		}
		if (month== 1 || month== 2) {
			if((month==1) && (day>=20 && day<=31)) {
				System.out.println("You're an Aquarius.. I guess that's okay...");
			}
			if((month==2) && (day>=1 && day<=18)) {
				System.out.println("You're an Aquarius.. I guess that's okay...");
			}
		}
		if (month==2 || month==3) {
			if((month==2) && (day>=19 && day<=29)) {
				System.out.println("Do you wanna go fishing? Cause you're a Pisces!");
			}
			if((month==3) && (day>=1 && day<=20)) {
				System.out.println("Do you wanna go fishing? Cause you're a Pisces!");
			}
		}
				
			
		}
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		

	}


