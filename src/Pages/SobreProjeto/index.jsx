import { Button, Container } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";

import '../../app.css'

import BarraLateral from "../../Componentes/BarraLateral";
import NavbarCustom from "../../Componentes/NavbarCustom";
import Overview from "../../Componentes/Overview/index"

function SobreProjeto() {
  return (
    <div className="container">
      <BarraLateral />
      <div>
        <NavbarCustom 
          title="Sobre o Projeto"
        />
        <div className="overview">
          <Overview />
        </div>
      </div>
    </div>
  );
}

export default SobreProjeto;
