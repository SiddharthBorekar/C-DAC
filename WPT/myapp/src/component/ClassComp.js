import React, { Component } from "react";

class ClassComp extends Component{
    render(){
        return (
            <div>
            <h2>This is ClassComp component</h2> 
            <p>This is a paragraph</p>
            <p>My name is : <strong>{this.props.myname}</strong>, I am <strong>{this.props.post}</strong> </p>
            <hr></hr>
            </div>
            
        )
    }
}
export default ClassComp;