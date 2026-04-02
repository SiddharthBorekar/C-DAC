import staticdata from '../shared/Constant/ConstantData';
// import ToggleImage from './ToggleImage'
const ImageToggleComp = () =>{
   return (
        <div>
            <h2>This is ToggleImage component</h2>
            <h2>Toggle Image Task 1</h2>
            <div>
                <img src={staticdata.Yourname} alt='Yourname' width="150px" height="150px"/>
                <br></br>
                <button type='button' id=''>ToggleImage</button>
            </div>
            <hr></hr>
        </div>
   )
}
export default ImageToggleComp;