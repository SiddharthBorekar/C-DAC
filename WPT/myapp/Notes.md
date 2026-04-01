✅What is React
▫️It is a Javascript laibrary.
▫️It is use to create rich user interface.
▫️It create SPA(Single page application).
▫️latest version of react is 19

Technology requirment
▫️Html,Css,js,(ES5,ES6,oops)
software Prerequsit
▫️nodejs,npm,IDE,

✅How to create React project.
1. By using npm => no need to install config file.
▫️npx create-create-app appname
▫️cd appname.
▫️npm start.
2. By using NPM => Need to install config file.
▫️npm install -g create-react-app
▫️npm create-create-app appname
▫️cd appname.
▫️npm start.
3. By Using Vite => It create react project with minimumfile size.

✅What is component in react.
1. It is partial part in react.
2. It can be any part of react project.
3. It create react it 

✅In react there are two types of components
▫️Wlile r=creating components its file name starts with Capital name.
1. Function components: Whent our main focus in UI design i that case we use it 
2. Class components: when we have to write complex logic in that case we use it.

✅How to display component Output.
1. To display component output first we have to import it and then write component name as tag.

✅What is JSX (Javascript XML)
1. JSX allow us to write html code with react components. 
2. it makes react code easy.
3. in JSX to multiple element we need to use one parentb element to wrap child element should block element like (div,p etc).

✅What is Props
1. it is parameter function parameters which is used to pass inside components.
2. It returns object type of data.
3. we can access props in function comp by writing props.keyname.
4. we can access props in class comp by writing this.props.keyname.

Task 1: create one function compo with name MyDetailscomp and pass props fname,lname,gener,city,country and display its output.
Task 2: create one class component with name FriendDetailsComp and pass props fname,lname,gener,city,country and display its output.
TASK 3: CREATE A COUNTER CLASS TO INCREMENT DECREMENT AND RESET COUNTER |  BY DEFAULT -> 0;

✅ What is State
1. state is used to handle esential data in class component.
2. It return object type of data
3. To access data outsite state we write this.state.keyname
4. In class comp we write state inside constructor.
▫️From react version 16 we use state in function components bt using Usestate hooks.
MystateComp.js

✅What to write function and method inside a comp.
▫️in onclick event we use arrow function if we use default function then we dont use 

✅Set state
▫️setsate method allow us to manuplate state data inside class components. This is inbuld method provide to us by react libery

✅Render => display component output i=on browser
✅Condition Render => Display component view on the basis of condition.
1. if else => 
2. Element as variable => 
3. use of ternary operator => shorthand syntax for if else 
   syntax: (Condition)? Truepart : falsepart
4. short-circuit(&&) => If the conditioon is true onlu display componemnt view.

✅ Before React version 16 We where not able to use state in function components In react version 16  Hooks get introduces with the help of     hooks we can use class components features in function components.
▫️ bY using usestate hooks we can use state in function components.
1. Hooks only work with function not in with a class
2. Hooks always use toplevel compoinents.
3. Hooks can render conditionally.

✅ Hooks Folder
1. UseStateHookComp.js
2. UseEffectHookComp.js
3. ReactHooksComp.js

▫️Usestate() Hook:
1. It allow us to use state in function components
2. for using it first we have to import from react library.
3. usestate hooks gives us 2 values 1.currentState, 2.function to update current
syntax: 


✅What is Virtual DOM
▫️In react before making changes in real DOM React create Virtual virtual DOM in its memory , where it does all the nessery changes in the virtual DOM. react update that part only which is required. Thats why React is Faster than angular.