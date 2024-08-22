
import { Button, Container } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

import '../../app.css';
import BarraLateral from '../../Componentes/BarraLateral';
import NavbarCustom from '../../Componentes/NavbarCustom';
import DetalhesProjeto from '../../Componentes/DetalhesProjeto'
import Overview from "../../Componentes/Overview"
function SobreProjeto() {


  return (
    <div className='container'>
      
      <BarraLateral/>
      <div className='main-content'>
      <NavbarCustom/>
      <Overview />
      <DetalhesProjeto></DetalhesProjeto>
      </div>

    </div>
  )
}

export default SobreProjeto
