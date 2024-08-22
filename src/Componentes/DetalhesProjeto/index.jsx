import { Button, Container } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import './DetalhesProjeto.css'
import Integrantes from '../Integrantes';

function DetalhesProjeto() {

    return (
        <div>
            <h2 className='titulo'>Detalhes</h2>
            <div className='blocodetalhes'>


                <div className='bolinha' id='b1'></div>
                <div className='bolinha' id='b2'></div>
                <div className='quadradotexto'>
                    <h3>Problema</h3>
                    <p>
                        Desafio 1 do Challenge 2024 da Softtek envolve criar um Assistente de Suporte Técnico com IA para melhorar a assertividade e agilidade no atendimento de chamados no Service Desk e AMS.
                    </p>
                </div>
                <div className='quadradotexto'>
                    <h3>Solução:</h3>
                    <p>
                        Desenvolvemos uma aplicação web integrando React no frontend com a API de IA Generativa da OpenAI no backend, aprimorando as capacidades de resposta automática e análise de chamados.
                    </p>
                </div>
                <div className='quadradotexto'>
                    <h3>Tecnologias empregadas:</h3>
                    <p>
                        UI Interativa: Construção de interfaces dinâmicas e responsivas usando React.
                    </p>
                    <p>
                        Componentes Reutilizáveis: Utilização de componentes para formulários, visualização de chamados e interações.
                    </p>
                    <p>
                        Roteamento Eficiente: Uso do React Router para uma navegação fluida entre páginas.
                    </p>
                </div>
                <div className='quadradotexto'>
                    <h3>Backend Python:(Next)</h3>
                    <p>
                        Geração de Respostas com IA: Acesso aos modelos avançados da OpenAI para análise e resposta a chamados.
                    </p>
                    <p>
                        Processamento de Linguagem Natural: Utilização de NLP para entender e responder consultas baseadas em texto.
                    </p>
                    <p>
                        Integração de API: Criação de endpoints que conectam o frontend ao poder computacional da OpenAI.
                    </p>
                </div>


            </div>
            <h2 className='titulo'>Membros da Equipe</h2>
            <div className='blocoMembros'>

            <Integrantes nome={'Geraldo Neves'} fotoLink={'https://github.com/Geraldnvs.png'}>
            Design do projeto e front-end
            </Integrantes>
            <Integrantes nome={'João Oliveira'} fotoLink={'https://github.com/Johnvitordev.png'}>
            Design do projeto e front-end
            </Integrantes>
            <Integrantes nome={'Mariana Leite'} fotoLink={'/Mariana.jpg'}>
            Design do projeto e front-end
            </Integrantes>
            <Integrantes nome={'Mere Angela'} fotoLink={'https://github.com/Mereangela.png'}>
            Design do projeto e front-end
            </Integrantes>
                
            </div>
            
            
            
        </div>


    )

}
export default DetalhesProjeto