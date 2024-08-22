import React, { useState, useEffect } from 'react';
import { Form, FormControl } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.css';
import './NavbarCustom.css';
import { Link, useLocation } from 'react-router-dom';

function NavbarCustom() {
    
    const localizacao = useLocation();
    
    const [tituloPagina, settituloPagina] = useState('');

    useEffect(() => {
        switch (localizacao.pathname) {
            case '/Home':
                settituloPagina('Home');
                break;
            case '/Tickets':
                settituloPagina('Tickets');
                break;
            case '/KnowledgeBase':
                settituloPagina('Knowledge Base');
                break;
            default:
                settituloPagina('Sobre o Projeto');
                break;
        }
    }, [localizacao]);

    return (
        <div className="navbar-custom">
            <h1 className="navbar-title">{tituloPagina}</h1>
            <div className="navbar-search">
                <Form className="search-form">
                    <FormControl type="text" placeholder="Procure" className="mr-sm-2 search-input" />
                </Form>
                <i className="bi bi-search"></i>
                <i className="bi bi-bell"></i>
            </div>
            <div className='botaoLogin'>
                <Link to={'/Logar'}>
                    <i className="bi bi-person-circle espaco"></i>login
                </Link>
            </div>
        </div>
    );
}

export default NavbarCustom;
