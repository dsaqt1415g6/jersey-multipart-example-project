# Jersey Multipart Example
This project is an example of Jersey Multipart developed at course "Design of Services and Applications" of  Castelldefels School of Telecommunications and Aerospace Engineering (EETAC).

## Installation
### Database
Connect as root to the database and execute the scripts `mediadb-user.sql` and `mediadb-schema.sql` in the `sql` folder.

### Web Front-End
#### Customization
Edit the value of the variable `URL` at the beginning of the `www/js/multipart.js` file to point the URL of the `images` resource deployed in the web application server.

#### Installation
Copy the contents of the `www` folder to your document root.

### RESTful Web Service
#### Customization
Edit the `application.properties` file in `jersey-multipart-example/src/main/resources`:

+   `uploadFolder`: set to the absolute path of the image folder under the document root
+   `imgBaseURL`: set to the absolute URL of the image folder.

#### Installation
Change directory to `jersey-multipart-example` and run:

	mvn package
	
Deploy generated war in the web application server.