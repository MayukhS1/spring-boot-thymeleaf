# spring-boot-thymeleaf
Created the project from: [spring.io](https://start.spring.io/) and created a new spring boot project named **spring-boot-thymeleaf** with *Thymeleaf and web as dependency.*

## what is thymeleaf?
Thymeleaf is an engine that builds dynamic pages from templates that are written in XHTML with the help of some special attributes, so it is a template engine.

A template engine is an engine that parses XHTML/HTML pages that contain special tags or attributes or syntax that is bound to variables at the server, and resolves them into their values, then parses the page according to those values and builds a normal HTML page.

Thymeleaf is an in-memory template engine, so it does all of it's processing in memory, it builds a DOM that maps to the HTML of the page in-memory and when values change the parsed pages are changed, also it's caching is an in-memory caching system.

Thymeleaf is a template engine that relays mostly on attributes instead of tags like what JSP would do, this makes it testable in the browser directly without requiring a server.

Those attributes are then translated and processed by Thymeleaf into normal HTML.

### more @: https://github.com/LaunchCodeEducation/cheatsheets/tree/master/thymeleaf 
*****************************************************************************************************************************************************************************************
## UPDATE: (1/10/2020) 
### Adding HOT SWAP 
HOT SWAP is a spring boot dev tool which enable hot swapping and fast application restarts when a class file in the classpath changes. This speeds up development by reducing the time spent in a change, re-build and manually restarting the container. 

However, the devtools only swing into action when a file in the classpath is changed. This does not happen by default in IntelliJ when you make a change to a java class file and save it. To make it happen, either:

_Build project (Cmd + F9) which recompiles files and updates the classpath folder, thereby triggering the devtools to do a fast app restart_

__or__

_Make the following change to the IDE registry (Cmd + Shift + A) entry for the following attribute to true_
___compiler.automake.allow.when.app.running___

[complete set-up Guide](https://mkyong.com/spring-boot/intellij-idea-spring-boot-template-reload-is-not-working/)

[for more info](https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/howto-hotswapping.html) 
*****************************************************************************************************************************************************************************************



