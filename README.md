This is a project involving Java, Sql, Mysql, Spring Boot,Jpa,Orm,Security,Password Encryption,Microservice Architecture,Api Gateway Routing ,PostMan(Testing).

How it works:
--------------------------------------------
SIGN UP

use the url : http://localhost:8000/user/signup

for signing up to the service , in POSTMAN type the above url and set to post method, go to body tab and set to raw file and JSON format in the text bar below type

{
"username":"myusername",
"password":"mypassword"
}  

replace in myusername and mypassword your own username and password and press send, id sign up succeeds u will get appropriate message in the bottom tab,

--------------------------------------------

SIGN IN

u can now login with this  url  :  http://localhost:8000/user,

and set to get method , then go to Authorization tab and select type as Basic Auth and type your 
username and password in the respective fields and press send , you will get a message if signin successful,

---------------------------------------------

Adding Notes/Messages

use the url : http://localhost:8000/user/addnotes

now set to post method, go to body tab set to raw file and json format and type in 

{
"message":"yourmessage"
}

in the yourmessage type your actual notes/message 

and press send, now at the bottom tab you will get all the notes ordered by date and time of posting .

------------------------------------------------------

Getting all Notes

use the url : http://localhost:8000/user/getallnotes

you need to signin to get your notes for this so sign in from above instructions, 
and set to get method and press send , now you will see all the messages you posted .

----------------------------------------------------





