import React, { Component } from "react";
import Yourname from '../shared/images/Yourname.jpg'
import staticdata from "../shared/Constant/ConstantData";

class MyimagesCom extends Component{
    render(){
        return (
            <div>
            MyimagesCom
            <br></br>
            
            <img src={staticdata.Yourname} alt='Yourname' width="150px" height="150px"/>
            <img src={staticdata.nature} alt='nature' width="150px"/>
            <img src={staticdata.study} alt='study' width="150px"/>
            </div>
                
        )
    }
}
export default MyimagesCom;{/* <img src={Yourname} alt='Yourname'/> */}