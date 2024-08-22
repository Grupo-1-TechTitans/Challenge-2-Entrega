
import { Button, Container } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

import '../../app.css';
import BarraLateral from '../../Componentes/BarraLateral';
import NavbarCustom from '../../Componentes/NavbarCustom';
import './Logar.css'
import LoginForm from '../../Componentes/LoginForm';

function Logar() {


  return (
    <div className='telaLogin'>

      <div className='ladoAzul'>
      <div className='circ1' />
      <div className='circ2'/>
      <h1>Tech Titans</h1>
      <p>Tecnologia com foco em eficiência</p>
      <div className='botaoMais'>
        <a href="/"><p>Mais</p></a>
        </div>
      </div>
      <div className='ladoBranco'>
        <LoginForm />

      </div>
      

    </div>
  )
}

export default Logar
