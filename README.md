# Email Sender

### Application Explain

#### for what reason this application:
let's take a situation that, if you have a frontend app and you need to ask 
each user to enter him email , so when you have a news about your product and you need to send one email from your company to all users
this is right place to take code and used into your app, seriously it's not good enough, but you can start from my little idea
Good Luck!

 Backend Side ==>
* WebConfig class : Handle CORS(Cross-origin resource sharing)
* entities : create a data model (id , email)
* repository : Interact with database and get all email, and when you enter your email check if exist same email or not
* EmailValidator : check if email valid or not (regex)
* EmailService : customize your email and send using EmailSender Interface
* EmailController : sniff the email sent from frontend 


Cloud side ==>
* I uploaded this app to heroku cloud platform , and use postgresql database in the cloud

I use SMTP protocol for  email transmission, you can find all configuration in application.properties file

Testing ==>
* I make a unit testing for repository class 
* test findSameEmail Method 