import React from "react";
import Table from "react-bootstrap/Table";
import Form from "react-bootstrap/Form";
import { FaPaperclip } from "react-icons/fa"
import ticketsData from '../../dados/tickets_data.json';

import "./style.css";

function TicketsInfo() {
  return (
    <div className="tickets-container">
      <h3>Informações dos Tickets</h3>
      <div className="table table-container">
        <Table responsive>
          <thead>
            <tr>
              <th></th>{/* {coluna para as checkboxes} */}
              <th scope="col">Tickets</th>
              <th scope="col">Prioridade</th>
              <th scope="col">Status</th>
              <th scope="col">Descrição</th>
              <th scope="col">Anexos</th>
            </tr>
          </thead>
          <tbody>
            <tr>
                <td>
                    <Form.Check type="checkbox" name="ticketSelect" />
                </td>
              <td>343234</td>
              <td>Alta</td>
              <td>Ativo</td>
              <td>Ticket Description</td>
              <td>
                <a href="#"><FaPaperclip className="anexo-icon" /></a>
              </td>
            </tr>
            <tr>
                <td>
                    <Form.Check type="checkbox" name="ticketSelect" />
                </td>
              <td>343234</td>
              <td>Alta</td>
              <td>Ativo</td>
              <td>Ticket Description</td>
              <td>
                <a href="#"><FaPaperclip className="anexo-icon" /></a>
              </td>
            </tr>
            
          </tbody>
        </Table>
      </div>
    </div>
  );
}

export default TicketsInfo;
