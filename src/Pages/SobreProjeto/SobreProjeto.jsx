
import { Button, Container } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

import './SobreProjeto.css';
import BarraLateral from '../../Componentes/BarraLateral';
import NavbarCustom from '../../Componentes/NavbarCustom';
import OverViewSection from '../../Componentes/OverviewSection';
import VideoOverview from '../../Componentes/VideoOverview/VideoOverview';

const SobreProjeto = () => {
  return (
    <div className='container-fluid'>
      <div className="row">
        <div className="col-md-2">
          <BarraLateral/>
        </div>
        <div className='col-md-10'>
          <NavbarCustom title='Sobre o Projeto'/>

          <div className="my-4">
            <OverViewSection
              title='Overview'
              description='Este projeto visa criar uma aplicação web para facilitar o gerenciamento de tarefas em equipes'
            />
          </div>
        
          <VideoOverview/>
        </div>
      </div>
    </div>
  );
};


export default SobreProjeto
