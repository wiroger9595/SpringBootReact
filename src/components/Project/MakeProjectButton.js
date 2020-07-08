import React, { Component } from 'react';
import {Link} from "react-router-dom";
 const MakeProjectButton =() => {

     return (
         <React.Fragment>
            <Link  to="./addProejct" className="btn btn-lg btn-info">
                Create a Project

                
            </Link>
        </React.Fragment>


        );
 };


export default MakeProjectButton;