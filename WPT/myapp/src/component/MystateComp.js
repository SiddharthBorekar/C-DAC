import React, { Component } from "react"
class MystateComp extends Component{

    constructor(){
        super();                    //this is a constuctor
       this.state ={
            name:"Siddhant",
            salary:5000
        }
    }

    greeting(){
        window.alert("Good morning Everyone");
    }
    Updatestate(){
        this.setState((prevState)=>({name:"Siddhant Borekar",salary:this.state.salary+5000}));  
        this.setState({name:"Siddhant Borekar",salary:this.state.salary+5000});
    }

    render(){
        return (    
            <div>
                MystateComp
                <p>My name: {this.state.name} and salary <strong>{this.state.salary}</strong></p>
                <button type='button' onClick={()=>this.greeting()}>Magic</button>
                <button type='button' onClick={()=>this.Updatestate()}>Change state</button>   
            </div>
            
                )
    }
}

export default MystateComp