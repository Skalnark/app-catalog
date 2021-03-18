# project-catalog

Companion repo for _Building Microservices with Clojure: A Practical Introduction to 
Tooling, Development, and Deployment_ link, from O'Reilly. This course is designed 
to help you a) build a small and useful microservice; b) get the hang of Clojure 
and functional programming so you can develop the skills required to use Clojure as your 
primary programming environment.

The 'Project Catalog' is a simple microservice which does primitive data listing 
and persistence of a simple model representing a project with minimal structure. 
The application uses Pedestal, which 
is a web service framework based on the Clojure language.

After you retrieve the source, you can run the application using the instructions below 
(the stock Pedestal-service template instructions) if you set the following environment variables
in your runtime shell. For all the functions to work, you'll need to have an account 
and application created with Auth0.com, and a MongoDB connection available
somewhere either locally or via a MongoDB-hosting service such as Compose.io.

In the video series, I show the basics of building up a simple web service using 
Pedestal from pedestal.io including persistence
using a simple JSON-based model in Clojure to write to MongoDB. 
This project represents the end result which has various functions in it which are added 
to the service.clj main file over the video series segments to illustrate how to (among 
other things): 

- work with HTTP calls to other services
- handle XML and JSON
- use interceptors to inspect incoming requests
- create responses with custom headers and HTTP status

In general, I don't claim that it's the most elegant and perfect Clojure, and 
I'm open to suggestions and improvements provided such "improvements" don't affect 
readability, especially for us Clojure n00bs.

Please use typical methods to offer fixes, suggestions, and/or improvements via PRs, wiki pages, or issue reports.


Thanks for checking it out!

Environment vars:

- MONGO_CONNECTION - this should be of the form mongodb://username:password@staff.mongohq.com:port/dbname to connect to a persistence layer.
- AUTH0_CLIENT_ID - when using Auth0, this is the client_id associated with a client
- AUTH0_SECRET - when using Auth0, this is the secret for the client


## Run the App

1. Start the application: `lein run-dev` \*
2. Watch the video series to see how to set up an environment using LightTable and an nRepl via `lein repl`

\* `lein run-dev` automatically detects code changes. Alternatively, you can run in production mode
with `lein run`.

## Configuration

To configure logging see config/logback.xml. By default, the app logs to stdout and logs/.
To learn more about configuring Logback, read its [documentation](http://logback.qos.ch/documentation.html).

## Links
* [Other examples](https://github.com/pedestal/samples)