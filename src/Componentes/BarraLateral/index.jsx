import React, { useState, useEffect } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.css';
import './BarraLateral.css'; 
import MenuLink from '../MenuLink';
import { Link } from 'react-router-dom';

function BarraLateral() {
  const [isOpen, setIsOpen] = useState(true);
  const [isNarrow, setIsNarrow] = useState(false);

  useEffect(() => {
    const handleResize = () => {
      setIsOpen(window.innerWidth > 768);
      setIsNarrow(window.innerWidth <= 1440);
    };

    handleResize();
    window.addEventListener('resize', handleResize);
    return () => window.removeEventListener('resize', handleResize);
  }, []);

  const toggleSidebar = () => {
    setIsOpen(!isOpen);
  };
 
  return (
    <>
      <button className={`hamburger ${isOpen ? 'hidden' : ''}`} onClick={toggleSidebar}>
        <i className="bi bi-list"></i>
      </button>
      <div className={`d-flex flex-column flex-shrink-0 p-3 BarraLateral-custom ${isOpen ? 'open' : ''} ${isNarrow ? 'narrow' : ''}`}>
        <Link to="/" className="d-flex BarraLateral-logo align-items-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
          <img src="/logo.png" alt="Tech Titans" className="" />
          <span className="fs-5">Tech Titans</span>
        </Link>
        <hr />
        <ul className="nav nav-pills flex-column mb-auto">
          <li className="nav-item">
            <MenuLink to='/Home' >
              <i className="bi bi-house-door"></i> <span className="menu-text">Home</span>
            </MenuLink>
          </li>
          <li>
            <MenuLink to='/Tickets'>
              <i className="bi bi-ticket-detailed-fill"></i> <span className="menu-text">Tickets</span>
            </MenuLink>
          </li>
          <li>
            <MenuLink to='/KnowledgeBase'>
              <i className="bi bi-journal-text"></i> <span className="menu-text">Knowledge Base</span>
            </MenuLink>
          </li>
          <li>
            <MenuLink to='/'>
              <i className="bi bi-info-circle-fill"></i> <span className="menu-text">Sobre o Projeto</span>
            </MenuLink>
          </li>
        </ul>
        <hr />
        <div>
          <MenuLink to="#" className="nav-link">
            <i className="bi bi-box-arrow-right"></i> <span className="menu-text">Logout</span>
          </MenuLink>
        </div>
      </div>
    </>
  );
}

export default BarraLateral;