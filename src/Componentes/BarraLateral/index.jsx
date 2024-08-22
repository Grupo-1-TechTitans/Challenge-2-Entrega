import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.css';
import './BarraLateral.css'; 
import MenuLink from '../MenuLink';
import { Link } from 'react-router-dom';


function BarraLateral() {
  return (
    <div className="d-flex flex-column flex-shrink-0 p-3  BarraLateral-custom">
      <Link href="/" className="d-flex BarraLateral-logo align-items-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
        <img src="/logo.png" alt="Tech Titans" className="" />
        <span className="fs-5">Tech Titans</span>
      </Link>
      <hr />
      <ul className="nav nav-pills flex-column mb-auto">
        <li className="nav-item">
          <MenuLink to='/Home' >
            <i className="bi bi-house-door"></i> Home
          </MenuLink>
        </li>
        <li>
          <MenuLink to='/Tickets'>
            <i className="bi bi-ticket-detailed-fill"></i> Tickets
          </MenuLink>
        </li>
        <li>
          <MenuLink to='/KnowledgeBase'>
            <i className="bi bi-journal-text"></i> Knowledge Base
          </MenuLink>
        </li>
        <li>
          <MenuLink to='/'>
            <i className="bi bi-info-circle-fill"></i> Sobre o Projeto
          </MenuLink>
        </li>
      </ul>
      <hr />
      <div>
        <MenuLink href="#" className="nav-link">
          <i className="bi bi-box-arrow-right"></i> Logout
        </MenuLink>
      </div>
    </div>
  );
}

export default BarraLateral;
