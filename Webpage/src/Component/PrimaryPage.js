import React, {Component} from 'react'
import './style.css'
import '../BackendServices/HTMLServiceReq'
class PrimaryPage extends Component {
    state = {

    }
    render(){
        return(
            <button type = 'button' onclick='clicked()' id="MainButton">Click to obtain data from SQL data></button>
        );
    }

}


export default PrimaryPage;
