import React, { Component } from "react"
import Childcompo from "./Chileecompo";
class ParentComponent extends Component{

    constructor(){
        super();                    //this is a constuctor
       this.state ={
           empname:"Joker",
           empsal:5000,
           itemName: "Mobile",
           itemprice: 1200


        }
    }

changedata(){
    this.setState((prevState)=>({empname:"Siddhant",empsal:this.state.empsal+5000}));
    this.setState((prevState)=>({itemName:"Siddhant",itemprice:this.state.empsal+5000}));
}
render(){
        return (
            <div>
               
                <h2>This is ParentComponent</h2>
                <p>Menu:<strong>{this.state.itemName}</strong></p>
                <p>Price:<strong>{this.state.itemprice}</strong></p>


                <p>Emp name:<strong>{this.state.empname}</strong></p>
                <p>Emp Salary:<strong>{this.state.empsal}</strong></p>
                <button type='button' onMouseOver={()=>this.changedata()}>Change emp data</button>
                <button type='button' onKeyDown={()=>this.changedata()}>Change emp data</button>
                {/* <button type='button' on={()=>this.changedata()}>Change emp data</button> */}
                 <hr></hr>
                 {/* <button type='button' onClick={()=>this.hour()}>Hour</button> */}
                 <Childcompo></Childcompo>
            </div>
                )
    }
}

export default ParentComponent;
