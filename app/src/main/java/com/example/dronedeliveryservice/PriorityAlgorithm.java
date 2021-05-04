package com.example.dronedeliveryservice;

import android.content.Intent;

import java.sql.Connection;
import java.sql.*;

import androidx.appcompat.app.AppCompatActivity;

public class PriorityAlgorithm extends AppCompatActivity{

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	int dist;
	private int baySel;


	public void readDataBase() throws Exception {

		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager
					.getConnection("jdbc:mysql://199.244.104.202:9866/aerialadvantage?"
							+ "user=cis&password=Leopard8080$$");

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement
					.executeQuery("select distance from delivery_info where distance");
			writeResultSet(resultSet);
			dist = sendResultSet(resultSet);

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	public void sendDB(String x) throws Exception {

		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager
					.getConnection("jdbc:mysql://199.244.104.202:9866/aerialadvantage?"
							+ "user=cis&password=Leopard8080$$");

			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery(x);
			//writeResultSet(resultSet);
			//dist = sendResultSet(resultSet);

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	private void writeMetaData(ResultSet resultSet) throws SQLException {
		//  Now get some metadata from the database
		// Result set get the result of the SQL query

		System.out.println("The columns in the table are: ");

		System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
		for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
			System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
		}
	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {
		// ResultSet is initially before the first data set
		System.out.println("Tables: ");
		while (resultSet.next()) {
			String dist = resultSet.getString(1);
			System.out.println(dist);
		}
	}

	private int sendResultSet(ResultSet resultSet) throws SQLException{
		String distance ="";
		while (resultSet.next()){
			distance=resultSet.getString(1);
		}
		return Integer.parseInt(distance);
	}

	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

	public static int transfer(String dist){
		int dist1 = Integer.parseInt(dist);
		return dist1;
	}

	public static int superAlgo(int[] bayC, int dist, int[] batt, int weight) {
		//In this algorithm we focus on getting the max number of packages the appropriate drone
		int c = weightClass(weight);
		System.out.println("Weight class is "+c);

		for(int i=0;i<bayC.length;i++) {

			if(bayC[i]==c&&batt[i]>=90&&dist<=10) {
				System.out.println("system 1");
				return i;
			}
			else if(bayC[i]==c&&dist<=5&&batt[i]>50) {
				System.out.println("system 2");
				return i;
			}
			else if(c>1&&bayC[i]==(c-1)&&batt[i]>90) {
				System.out.println("system 3");
				return i;
			}
			else if(c>1&&bayC[i]==(c-1)&&dist<5&&batt[i]==100) {
				System.out.println("system 4");
				return i;
			}
			else if(c>2&&bayC[i]==(c-2)&&dist<3&&batt[i]==100) {
				System.out.println("system 5");
				return i;
			}
			else if(c!=3&&bayC[i]==(c+1)&&batt[i]>50) {
				System.out.println("system 6");
				return i;
			}
			else if(c==1&&bayC[i]==(c+2)&&batt[i]>30) {
				System.out.println("system 7");
				return i;
			}
			else if(dist<1&&batt[i]>20) {
				System.out.println("system 8");
				return i;
			}
		}

		return -2;
	}

	public static int weightClass(int weight) {
		if(weight>=3&&weight<=5)
			return 3;
		if(weight>0&&weight<2)
			return 1;
		if(weight>=2&&weight<3)
			return 2;
		else {
			System.out.println("Package is too heavy");
			return -1;
		}
	}
	
	public void main(String ags[]){
		Intent intent2 = getIntent();
		String product_weight_key = intent2.getStringExtra("product_weight_key");

		int [] bay = {1,1,2,2,3,3};
		int [] batt = {80,70,90,40,85,100};
		int weight = Integer.parseInt(product_weight_key);
		int BaySel = superAlgo(bay,dist,batt,weight);
		this.baySel=BaySel;
	}

	public int getBaySel(){
		return this.baySel;
	}
 
}
