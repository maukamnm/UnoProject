# Uno Project
In my Grand Canyon University Java Certificate program, I spent months learning and practicing the basics of Java through the advanced pieces needed to make a full-stack application.  The final application ties all the pieces of the program together. The application includes Spring Boot, React, Java, and Rest.
I had created an Uno game that played a full game following all the game rules in the first weeks of the GCU Java program, . The game was not interactive, so the program made some assumption when a wild card was played on the color selection.  No Artificial Intelligence (AI) was used; it was only week four.
Throughout the program, we constantly revisited the application to add new functionality and refactor the code.  Looking back at the original project and the end project, I realized how much I have grown as the program progressed.
>I realized how much I have grown as the program progressed.
At one point, we had to incorporate our code with another student's code.  Experiencing the combination and collaboration of individuals ideas and programming into one coherent application was a challenge that I expect will serve me well in my career.
The last piece was to take the console application and add a React or UX/UI pieces.  The final program runs on a React server and the back-end runs a Spring Boot Java Rest application. Please follow the instructions to download and run the application on your own computer and let me know what you think!
- _Mara Munoz_
## Technical Pieces
### Tools
 - Java 14
 - React
 - Eclipse 4.16.0
 - VSCode 1.48
### Prerequisites
1. Make sure npm is installed. Mine was 6.14.6
```
npm --version
```
2. Make sure Java is installed. Mine was 14.0.1
```
java --version"
```
### Installing the full application (Java and React)
1. Clone this repository to your computer.
```
git clone https://github.com/maukamnm/UnoProject.git
```
It will create a directory called UnoProject.
2. Install the back-end piece. See instructions below.
3. Install the front-end piece. See instructions below.
### **BACK-END**: Installing and running the Spring Boot (Java API)
1. From your favorite IDE import the 235WK4-James-p2-Benchmark application from the UnoProject folder. I used Eclipse.
2. Run the Application.java from the package com.munoz as a "Java Application"
### **FRONT-END**: Installing and running the React application
1. From a command, DOS, terminal prompt, navigate to the UnoProject/Front-End-Uno folder
2. Make sure you arena the Front-End-Uno folder.
3. Remove any .lock files
4. Run
```
npm install
```
5. Run
```
npm start
```
### **EXECUTING** the program
1. If the browser does not open after step 5 above, you can open a browser and visit: http://localhost:3000
2. Click the "turn" button in the middle of the page.
3. The Java code, finds a playable card and adds it to the discard pile.
4. When any player gets down to one card, the React application has the user say "Uno."
5. When a player has zero cards left, the React application declares a winner.
**To see the standard Uno game rules which were deployed in this application, visit. The Uno rule Web site: [Official Uno Rules] (https://www.unorules.com/)
## Possible Enhancements ##
- Enter number of players and give them names.
- Logic in picking the color for wild cards. Right now always picks "Blue."
- Build in pints for scoring multiple game.
- Create a web system players are real people and where each player only sees their hand and the discard pile.
unorules.comunorules.com
Uno Rules - The Original Uno Card Game Rules
https://www.unorules.com/ 
