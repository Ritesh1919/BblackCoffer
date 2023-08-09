# BlackCoffer
A assignment by BlackCoffer

## Description
The objective of this assignment is to create a data visualization dashboard as per as instructions given below.
 
Data :- Data.csv
 
Data Visualization Dashboard
 - Use data given in Data.csv
 - Create a database (of your interest such as mongodb, postgresql, sql, Mysql) from the Data.csv data given.
 - Use Java as the backend, and react.js or angular.js as a frontend to design and develop a dashboard
 - For charts or visualizations, you can use either of the following:
	o   D3.js (recommended)
	o   chart.js
	o   fusioncharts
	o   plotly.js
	o   google charts
	o   highcharts
	o   etc.
 - You must use the given data only.
 - Develop any creative visualization that you like most, using provided data in csv.
 - Interactive graphs, charts, and visuals are recommended
 - The dashboard should read the data from the database.
 - Create API in java/spring boot to get data from the database

Important variables to be visualized
 - Intensity
 - Likelihood
 - Relevance
 - Year
 - Country
 - Topics
 - Region
 - City

Filters in the dashboard
 - Add end year filter in the dashboard
 - Add topics filters in the dashboard
 - Add sector filter in the dashboard
 - Add region filter in the dashboard
 - Add PEST filter in the dashboard
 - Add Source filter in the dashboard
 - Add SWOT filter in the dashboard
 - Country
 - City
 - Any other control or filters that you can add from the data, best of your knowledge

## Project Structure
- `Web Pages`: Contains the Web source code.
		o  META-INF
			o  context.xml
		o  WEB-INF
			o web.xml
		o  index.html

- `source Packages\com.blackcoffer`: Contains the Java source code.
		o  ConnectionProvider.java
		o  DataJDBC.java
		o  MyObject.java
		o  MyServlet1.java

- `Libraries`: All necessary Libraries.
		o  mysql-connector-java-8.0.11.jar
		o  gson-2.3.1.jar
		o  JDK 20
		o  Apache Tomcat
	
- `Configuration files`: Configuration files.
		o  web.xml
		o  MANIFEST.MF
		o  context.xml
		o  web-fragment.xml


- `resources/`: Additional resources, if any.

## Requirements
- JDK 20
- Apache Tomcat
- NetBeans , Spring Tool Suit or ect.
- MySql

## How to Run
1. Clone the repository: `git clone https://github.com/Ritesh1919/BblackCoffer.git`
2. Open project in NetBeans: Open the cloned project into netbeans.
3. Insert the CSV file into MySql using MySql Workbench : use the Database name as 'blackcoffer' and the table name as 'data'
4. Run the program: Run the program using NetBeans IDE.

## Usage Instructions
- After Start the program you will get the user interface on you selective browser and then you will get a select option where the default value is 'intensity'.
- You can choose any option with your choice.  After choosing the option you can hit the enter button then,
  it will redirect you to the output page where you will get the required variables in the form of arrays of 
  the object which is mentioned in the description of the assignment.

## Design and Approach
- I am faching the field which is selected by the user from the backend using servlet and JDBC. The querry is dynamic that will return a resultset then I have convert
  that data into a class object call MyObject and then i have stored that object into a List<MyObject> then my JDBC function will retun a GSON data that is a String.
  Before return that srting I have to convert the object intro JSON that is possible with the help of GSON libraies and then I can return that string to the front-end.

## Challenges and Learnings
- The challenges I had with this assignemnt is converting the ResultSet data into JSON fromat so that I can use it into JavaScript.
- And then I a facing the issue with the front-end.  


## Future Improvements
- I will merge the front-end with the return data. 

## Contact Information
For questions or feedback, contact:
- Name: Ritesh
- Email: riteshkashyap9999@gmail.com
- GitHub: github.com/Ritesh1919

