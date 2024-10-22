import React, { useState } from "react";
import {
  GoogleGenerativeAI,
  HarmCategory,
  HarmBlockThreshold
} from "@google/generative-ai";
import "./style.css";
import ImageSrc from "../../assets/images/image.jpg";

const apiKey = "AIzaSyBxsQ9XPzTqd-NmLZdhoDYv_VVMKrNgxqY"; // Certifique-se de definir a chave de API corretamente
const genAI = new GoogleGenerativeAI(apiKey);

const Comment = () => {
  const [messages, setMessages] = useState([
    {
      user: "bot",
      text: "Como posso te ajudar hoje?",
    },
  ]);
  const [input, setInput] = useState("");
  const [loading, setLoading] = useState(false);

  const handleInputChange = (e) => {
    setInput(e.target.value);
  };

  const sendMessage = async () => {
    if (input.trim() === "") return;

    const userMessage = { user: "user", text: input };
    setMessages([...messages, userMessage]);
    setInput("");
    setLoading(true);

    try {
      const model = genAI.getGenerativeModel({
        model: "gemini-1.5-flash",
        systemInstruction:
          "Responda a pergunta de maneira clara e direta. A resposta vai ser renderizada em um site entao forneça a resposta em formato HTML",
      });

      const chatSession = model.startChat({
        generationConfig: {
          temperature: 1,
          topP: 0.95,
          topK: 64,
          maxOutputTokens: 8192,
          responseMimeType: "text/plain",
        },
        history: [
          {
            role: "user",
            parts: [
              {
                text: input,
              },
            ],
          },
        ],
      });

      const botResponse = await chatSession.sendMessage(input);
      console.log(botResponse)
      const botMessage = { user: "bot", text: botResponse.response.text() };
      setMessages((prevMessages) => [...prevMessages, botMessage]);
    } catch (error) {
      console.error("An error occurred:", error);
      const botMessage = { user: "bot", text: "Desculpe, houve um erro ao processar sua solicitação." };
      setMessages((prevMessages) => [...prevMessages, botMessage]);
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="solution-container">
      <div className="ai-solutions">
        <img src={ImageSrc} alt="" className="avatar-ai" />
        <h3>Soluções Geradas por AI</h3>
        <p>Digite uma pergunta abaixo para começar</p>
      </div>

      {/* Seção de Chatbot */}
      <div className="comment-section">
        <h4>ChatBot</h4>
        <div className="comments">
          {messages.map((msg, index) => (
            <div
              key={index}
              className={`comment ${msg.user === "bot" ? "bot" : "user-message"}`}
            >
              <img
                src={
                  msg.user === "bot"
                    ? "https://isobarscience-1bfd8.kxcdn.com/wp-content/uploads/2020/09/default-profile-picture1.jpg"
                    : "https://isobarscience-1bfd8.kxcdn.com/wp-content/uploads/2020/09/default-profile-picture1.jpg"
                }
                alt="foto de perfil"
                className="avatar"
              />
              <div
                className="comment-text"
                dangerouslySetInnerHTML={msg.user === "bot" ? { __html: msg.text } : { __html: `<p>${msg.text}</p>` }}
              />
            </div>
          ))}
        </div>
        <div className="comment-input">
          <input
            type="text"
            value={input}
            onChange={handleInputChange}
            placeholder="Digite sua pergunta..."
            disabled={loading}
          />
          <button className="btn btn-primary" onClick={sendMessage} disabled={loading}>
            {loading ? "Enviando..." : "Enviar"}
          </button>
        </div>
      </div>
    </div>
  );
};

export default Comment;