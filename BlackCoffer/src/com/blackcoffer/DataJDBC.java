package com.blackcoffer;

import java.sql.*;
import java.util.*;

public class DataJDBC {

	public static ArrayList displayData() {

		ArrayList<String[]> arr = new ArrayList<String[]>();
//		String arr[][];
		try {
			Connection connection = ConnectionProvider.createConnection();
			String querry = "select intensity,relevance,end_year,country,topic,region,city,likelihood from data";
			Statement st = connection.createStatement();
			ResultSet result = st.executeQuery(querry);
			while (result.next()) {
				int intensity = result.getInt(1);
				int relevance = result.getInt(2);
				int end_year = result.getInt(3);
				String country = result.getString(4);
				String topics = result.getString(5);
				String region = result.getString(6);
				String city = result.getString(7);
				int likelihood = result.getInt(8);

				String string_intensity = Integer.toString(intensity);
				String string_relevance = Integer.toString(relevance);
				String string_end_year = Integer.toString(end_year);
				String String_likelihood = Integer.toString(likelihood);

				String data[] = { string_intensity, string_relevance, string_end_year, country, topics, region, city,
						String_likelihood };
				arr.add(data);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return arr;
	}

}
