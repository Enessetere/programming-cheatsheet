#Programming Cheat-Sheet

1. **Covered Design Patterns**

    1. ***Creational***
        - abstract factory
        - builder
        - factory
        - object pool
        - prototype
        - singleton
        
    2. ***Structural***
        - adapter
        - bridge
        - composite
        - decorator
        - facade
        - flyweight
        - proxy
        
    3. ***Behavioral***
        - chain of responsibility
        - command
        - interpreter
        - iterator
        - mediator
        - memento
        - observer
        - state
        - strategy
        - template
        - visitor

2. **Description**

***Abstract factory*** is a creational design, pattern that allows creating multiple related objects without specifying concrete class.
For example: imagine company, that can create both cars and bikes. Creating them all in one place could be difficult. So this company have two factories, one for creating cars, and second for creating bikes. Each of them have blueprints to create various models of these vehicles.

***Adapter*** is a structural design pattern, that allows cooperating two different incompatible objects. 
For example: you have two systems that holds users, but they are in a different format. So you need some kind converter between them, to store user details in database or display it together in same window.

***Bridge*** is a structural design pattern, that allows splitting large class into abstract class and its implementation, which only communicate with abstract class.
For example: you have a big database of questions with many methods, and you want to modify them without adding another lines of code. So you can create an interface that will communicate with questions, and use it to control and modify them, without changing their processes.

***Builder*** is a creational design pattern, that allows building more complex objects step by step.
For example: when you have class with 10 or more fields in a constructor. It is hard to remember all of them and their order. You can create inner class, that will build base class by setting fields one after another.

***Chain of responsibility*** is a behavioral, design pattern that allows passing request down the chain, and each object decides to process and/or pass request further.
For example: you have a post alert system, which shows you notification about new mail in ie. facebook. But you are not always available there, so you want to get notification via SMS or via some other communication. You will need to create a chain of notification senders, which will pass request between objects and send notification on desired communication channel. 

***Command*** is a behavioral design pattern, that allows modifying request into an object with all request information.
For example: you create new text editor with plenty of buttons that helps you format text. It will be hard to manage all of them from single class. But if you create an interface that will be implemented by all buttons, then you can call one command to process right method, instead of calling different function for each button.

***Composite*** is a structural design pattern, that allows composing objects into tree structure.
For example: in company, the most important person is Boss. Next in charge are deputy, manager and so on. If you want to create HR system for company, you have to transfer this structure into it. Leader can order his team to do something, but he can't order anything to manager. So boss will be root of a tree, 1st branches will have deputies and so on.

***Decorator*** is a structural design pattern, that allows adding new duties to objects by placing them in special wrapper objects.
For example: you want to log every change system, you have created class to log necessary data. All you need is to call it. Or even better is to wrap this object in wrapper, so you can log state before and after processing.

***Facade*** is a structural design pattern, that allows usage of simplified interface communicated to encapsulated library, framework etc.
For example: you want to create user service for some complex system. This system will interact with user data in two ways: register and login. There is no point in exposing whole implementation to the system, its much better way to create a simple interface that will encapsulate your service and expose only basic register and login endpoint.

***Factory*** is a creational design pattern, which expose interface to create objects within base class, but allows to modify their type.
For example: you create a system, allows user to manage project. But there is a difference between using it for personal, educational or commercial purpose. So you have to come with billing plans that suits purposes. Most of them will be different in price and tax. So you can use factory here, that will create a different plan based on purpose.

***Flyweight*** is a structural design pattern, that allows extracting similar constant fields of object into another class and use their references inside mutable object.
For example: consider 10.000 objects, that represents stone in game. Let's say, that you have few different visualization of these stones, which contains graphics, nodes, metrics. These you can easily extract to another class and store it in list, and then pass their reference to stone objects.

***Interpreter*** is a behavioral design pattern, that allows defining grammar and interpreter for interpretable language.
For example: when you create your api, your endpoint receives string with some collection values. You have to use interpreter to translate it into collection in your app.  

***Iterator*** is a behavioral design pattern, that allows working on collection without exposing its inner implementation.
For example: you have an array of objects, that contain names, nicknames etc., and you want to expose them to your app without exposing inside mechanics. The best way to achieve that is to create iterator, that will run through your array without changing it.

***Mediator*** is a behavioral design pattern, that allows creating common communication interface between multiple objects.
For example: you are creating application to assist aircraft tower control in managing landing priority. Aircraft's won't contact each other to decide who's going to land first. Mediator can contact with each of them and place them in landing queue and send them a message, when they can attempt to land.

***Memento*** is a behavioral design pattern, that allows remembering and exposing previous state of object.
For example: you are creating some project. During your work, you have deleted few methods by mistake. Then you are clicking an Undo button, which recovers state of your work from before deletion. This is memento.

***Object pool*** is a creational design pattern, that allows creating pool for heavy objects to reuse them instead of creating new one.
For example: you have to create async connections to DB. Each of them takes time and resources to create. Better idea is to create only few connections and pass them around application.

***Observer*** is a behavioral design pattern, that allows observing and notifying changes in observed object to connected objects.
For example: you are creating chat application, that allows user to create a private channel and send there message to his/her friends. Observer design patterns tells us how to do it.

***Prototype*** is a creational design pattern, that allows cloning class, to prevent changes in prototype class.
For example: you want to simulate growth of your game character without modifying its data. Best option to do that is to clone this character and modify this clone. Prototype design pattern tells us how to do this.

***Proxy*** is a structural design pattern, that allows flow control by a substitute restricted object.
For example: consider creating large system that manage processes inside company infrastructure. Not every process can be accessed by any user, some of them must be restricted. Proxy design pattern shows us how we can restrict parts of application.

***Singleton*** is a creational design pattern, that allows creating only one object of class in application.
For example: you want to create user database to store user data. You need to create single instance of repository, and allow other parts of software to interact with it. Singleton design pattern ensures that we can create only one instance of class.

***State*** is a behavioral design pattern, that allows modifying object behavior driven by its state.
For example: consider a cycle of creating an article. First you create a draft. After finish, you send the draft to review, and finally it will be published on site. Where your article will be passed depends on its state. State design pattern shows, how we can manage this.

***Strategy*** is a behavioral design pattern, that allows defining algorithms family, split them between classes and make them replaceable.
For example: consider a calculator. It allows you to make calculations by calling specific algorithm. This algorithm will be selected by pressing corresponding sign on the interface. This is a basic concept of Strategy pattern.

***Template*** is a behavioral design pattern, that allows creating framework from similar classes and replacing only parts that are different for each class.
For example: consider creating web page. On each page you will have same header, graphics etc. and only part which will change is content. Same goes to called methods. If there are similar initialization, destroying or process methods in two or more parts of application, you can extract them into global class and replace only different parts. This is a basic concept of template design pattern. 

***Visitor*** is a behavioral design pattern, that allows adding new functionalities to objects without modifying their implementation. 
For example: consider creating map application. You created nodes with address and coordinates. You want now to extend functionality of your application, like reserving tables, check menu or whatever. There are two ways to achieve it: rebuild nodes to meet new requirements or create an interface that will engage the node and process any changes you want. That's how Visitor design pattern works.
