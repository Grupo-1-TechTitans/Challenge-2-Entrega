import { Button, Container } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";

import "../../app.css";
import "./style.css"
import BarraLateral from "../../Componentes/BarraLateral";
import NavbarCustom from "../../Componentes/NavbarCustom";
import TicketsAi from "../../Componentes/TicketsAi";
import TicketsTable from "../../Componentes/TicketsAi";

function Tickets() {
  return (
    <div className="container">
      <BarraLateral />
      <div className="main-content">
        <NavbarCustom />
        <div className="tickets-info">
          <TicketsTable />
        </div>
      </div>
    </div>
  );
}

export default Tickets;
