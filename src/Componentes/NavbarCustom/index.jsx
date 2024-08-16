import React from 'react';
import { Form, FormControl, Button } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.css';
import './NavbarCustom.css';
import { Link } from 'react-router-dom';

function NavbarCustom({ title }) {
    return (
        <div className="navbar-custom">
            <h1 className="navbar-title">{title}</h1> 
            <div className="navbar-search">
                <Form className="search-form">
                    <FormControl type="text" placeholder="Procure" className="mr-sm-2 search-input" />
                </Form>
                <i className="bi bi-search"></i>
                <i className="bi bi-bell "></i>
            </div>
            <div className='botaoLogin'>
            <Link to={'/Logar'}> 
                
                <i className="bi bi-person-circle espaco" ></i>login

            </Link>
            </div>

        </div>
    );
}

export default NavbarCustom;
