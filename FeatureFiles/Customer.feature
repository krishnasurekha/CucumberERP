Feature:
As Admin user validate Customer module
@customer
Scenario Outline:
Validate Add customer with multipe data
Given launch browser
When Launch url "http://webapp.qedgetech.com/" in a browser
When Wait For username with "name" and "username"
When Enter Username with "name" and "username" and"admin"
When  Enter password with "xpath" and "//input[@id='password']" and "master"
When click login button	with "xpath" and "//button[@id='btnsubmit']"
When Wait for customer link with "xpath" and "(//a[starts-with(text(),'Customers')])[2]"
When click customer link	 with "xpath" and "(//a[starts-with(text(),'Customers')])[2]"
When Wait for Add+icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When  click Add+icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When Wait for Customer Number with "xpath" and "//input[@id='x_Customer_Number']"
When capture customer number with "xpath" and "//input[@id='x_Customer_Number']"
When Enter in "<CustomerName>" with "name" and "x_Customer_Name" 
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "name" and "x_Notes"
When Click Add button with "id" and "btnAction"
When Wait for Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When click Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Click alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Validate customer table
When Click Logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser
Examples:
|CustomerName|address|city|country|cperson|pnumber|mail|mnumber|note|
|Akhilesh1|srnagar6|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|
|Akhilesh4|srnagar|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|
|Akhilesh6|srnagar|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|
|Akhilesh6|srnagar0|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|
|Akhilesh7|srnagar5|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|
|Akhilesh8|srnagar|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|
|Akhilesh16|srnagar5|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|
|Akhilesh17|srnagar|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|



