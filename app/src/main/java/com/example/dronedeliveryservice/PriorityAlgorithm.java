package com.example.dronedeliveryservice;

import java.util.Scanner;
import java.sql.*;

public class PriorityAlgorithm {
	
	public static int algoWeight(Bay[] bay, Package p1) {
		
		int wClass=0;//0 is default, 1=small, 2=medium, 3=large
		double weight = p1.getWeight();
		//System.out.println(weight);
		if(weight<=1.0) {
			wClass=1;
		}
		if(weight>1.0&&weight<=2.0) {
			wClass=2;
		}
		if(weight>2.0&&weight<=5.0) {
			wClass=3;
		}
		else {
			weight = -1;
		}
		//System.out.println(wClass);
		for(int i=0;i<bay.length;i++) {
			if(bay[i].getWeight()==wClass) {
				return bay[i].getID();
			}		
		}
		return -1;
	}
	
	public static int algoBat(Bay[] bay, java.lang.Package p1, Drone[] drone) {
		double [] bat = new double[drone.length];
		boolean [] highBat = new boolean[drone.length];
		for(int i=0;i<drone.length;i++) {	
			bat[i]=drone[i].getBattery();
		}
		
		
		
		return -1;
	}
	
	public static int algoDist(Bay[] bay, Package p1) {
		double distance=p1.getDistance();
		
		return -1;
	}
	
	public static void main(String ags[]) {
		Scanner input = new Scanner(System.in);
		Bay [] bay = new Bay[10];
		Drone [] drone = new Drone[10];
		for(int i=0;i<bay.length;i++) {
			int rand = (int)(Math.random()*2)+1;
			int weight = (int)(Math.random()*3)+1;
			Boolean bool = false;
			if(rand==1) {
				bool = true;
			}
			bay[i]= new Bay(i,bool);
			if(bool==true) {
				bay[i].setWeight(weight);
				//drone[i].setID((int)(Math.random()*1000)+1);
				//drone[i].setBattery((int)(Math.random()*100)+1);
			}
			/*else {
				drone[i].setID(-1);
				drone[i].setBattery(-1);
			}*/
				
		}
		
		for(int i=0;i<=bay.length-1;i++) {
			System.out.print("Bay: ");
			System.out.print(bay[i].getID());
			System.out.print("| status: ");
			System.out.format("%5s",bay[i].getReady());
			System.out.print("| weight class: ");
			int weight =bay[i].getWeight();
			if(weight==1)
				System.out.print("small");
			if(weight==2)
				System.out.print("medium");
			if(weight==3)
				System.out.print("large");
			System.out.println("");
		}
		
		System.out.println("Enter the weight of the package");
		double wClass=0;
		wClass = input.nextDouble();
		Package p1 = new Package(wClass);
		System.out.print("Omptomized bay is: ");
		System.out.print(algoWeight(bay,p1));
		/*try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://199.244.104.202:9866/aerialadvantage","ubuntu","Cis1277649");
			//here aerialadvantage is database name, root is username and password
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select droneID from drone_info");
			Resultset rs1=stmt.executeQuery("select weightClass from item_info");
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}
		catch(Exception e){ System.out.println(e);}*/ 
		
	}
 
}
