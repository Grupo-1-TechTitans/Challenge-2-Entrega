import React from 'react';
import './StatusCard.css'; // O CSS será o mesmo da parte anterior, com possíveis ajustes.

const StatusCard = ({ titulo, number, percentage, iconUrl }) => {
    const circleStyle = {
        background: `conic-gradient(#007bff 0% ${percentage}%, #e0e0e0 ${percentage}% 100%)`
    };

    return (
        <div className="status-card">
            <div 
                className="status-icon" 
                style={{ backgroundImage: `url(${iconUrl})` }}
            ></div>
            <p className="status-title">{titulo}</p>
            <div className="status-circle" style={circleStyle}>
                <span className="status-number">{number}</span>
            </div>
        </div>
    );
}

export default StatusCard;
