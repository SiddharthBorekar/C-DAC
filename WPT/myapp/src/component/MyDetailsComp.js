//Task 1: create one function compo with name MyDetailscomp and pass props fname,lname,gener,city,country and display its output.
//Task 2: create one class component with name FriendDetailsComp and pass props fname,lname,gener,city,country and display its output.
//TASK : CREATE A COUNTER CLASS TO INCREMENT DECREMENT AND RESET COUNTER |  BY DEFAULT -> 0 
const MyDetailsComp = (props) =>{
   return (
        <div>
            <h2>This is MyDetailsComp component</h2> 
            <p>My name is : <strong>{props.fname}</strong> <strong>{props.lname}</strong> <strong>{props.gender}</strong>,<strong>{props.city}</strong>,<strong>{props.country}</strong></p>
            <hr></hr>
        </div>
   )
}



export default MyDetailsComp;





