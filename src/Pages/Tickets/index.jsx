
import { Button, Container } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

import '../../app.css';
import BarraLateral from '../../Componentes/BarraLateral';
import NavbarCustom from '../../Componentes/NavbarCustom';

function Tickets() {


  return (
    <div className='container'>
      
      <BarraLateral/>
      <div>
      <NavbarCustom/>

      </div>

    </div>
  )
}

export default Tickets
