import React from "react";
import "./style.css";

const Solution = () => {
  return (
    <div className="solution-container">
      <div className="ai-solutions">
        <h3>Soluções Geradas por AI</h3>
        <p>Selecione o ticket acima para inciar</p>
        <button className="btn btn-primary">Visualizar</button>
      </div>

      {/* Seção de Comentários */}
      <div className="comments-section">
        <h4>Comment</h4>
        <div className="comment">
          <img
            src="https://isobarscience-1bfd8.kxcdn.com/wp-content/uploads/2020/09/default-profile-picture1.jpg"
            alt="foto de perfil"
            className="avatar"
          />
          <div className="comment-text">
            <span className="user-name">Ali</span>
            <p>
              Lorem, ipsum dolor sit amet consectetur adipisicing elit. Quae,
              assumenda.
            </p>
          </div>
        </div>
        <div className="comment-input">
          <input type="text" placeholder="typing..." />
          <button className="btn btn-primary"> Enviar</button>
        </div>
      </div>
    </div>
  );
};

export default Solution;
