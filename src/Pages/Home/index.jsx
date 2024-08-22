
import { Button, Container } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

import '../../app.css';
import BarraLateral from '../../Componentes/BarraLateral';
import NavbarCustom from '../../Componentes/NavbarCustom';
import StatusCArd from '../../Componentes/StatusCard'
function Home() {


  return (
    <div className='container'>
      
      <BarraLateral/>
      <div>
      <NavbarCustom/>
      <div className='infoarea'>

        <div className='filter'>
          aqui vai o filtro
        </div>
        <div className='graficos'>
          aqui vao os graficos
          <StatusCArd titulo={'Tickets Abertos'} number={45} iconUrl={''} percentage={45}></StatusCArd>
        </div>

        <div className='tabela'>

        </div>
      </div>
      </div>

    </div>
  )
}

export default Home
