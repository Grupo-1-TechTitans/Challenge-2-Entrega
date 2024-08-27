import React from "react";
import { Button, Container } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";

import "../../app.css"; // Certifique-se de que o caminho está correto
import "./style.css";

import BarraLateral from "../../Componentes/BarraLateral";
import NavbarCustom from "../../Componentes/NavbarCustom";
import TicketsInfo from "../../Componentes/TicketsInfo";
import Commet from "../../Componentes/Comment";

function Tickets() {
  return (
    <div className="container-page">
      <BarraLateral/>
      <div className="main-content">
        <NavbarCustom/>
        <TicketsInfo />
        <Commet />
      </div>
    </div>
  );
}

export default Tickets;
