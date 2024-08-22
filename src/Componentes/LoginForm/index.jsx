import React from 'react';
import { Form, Button, Container } from 'react-bootstrap';
import './LoginForm.css'

function LoginForm() {
  return (
    <div className="login-container" >
      <h2>Olá!</h2>
      <p>Seja bem vindo</p>

      <Form>
        <Form.Group  controlId="formBasicEmail">
          <Form.Control  className='campoTexto' type="email" placeholder="Email Address" />
        </Form.Group>

        <Form.Group controlId="formBasicPassword">
          <Form.Control className='campoTexto' type="password" placeholder="Password" />
        </Form.Group>

        <Button className='campoTexto' variant="primary" type="submit" block>
          Login
        </Button>
        <div >
          <a className='forgot' href="#">Forgot Password</a>
        </div>
      </Form>
    </div>
  );
}

export default LoginForm;
