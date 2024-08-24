import { Button, Container } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";

import "../../app.css";
import "./style.css";
import BarraLateral from "../../Componentes/BarraLateral";
import NavbarCustom from "../../Componentes/NavbarCustom";
import TicketsInfo from "../../Componentes/TicketsAi";
import Commet from "../../Componentes/Comment";

function Tickets() {
  return (
    <div className="container">
      <BarraLateral />
      <div className="main-content">
        <NavbarCustom />
        <TicketsInfo />
        <Commet />
      </div>
    </div>
  );
}

export default Tickets;
