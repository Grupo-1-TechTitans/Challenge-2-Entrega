import React from 'react';
import image from '../../assets/images/image.png';
import './VideoCard.css'


const VideoCard = ({ title, imageSrc = image, user, description }) => {
    return (
        <div className="video-card">
            <h2 className='video-title'>{title}</h2>
            <div className="video-info">
                <p className='text-user'><strong>{user}</strong></p>
                <p className='text-description'>{description}</p>
            </div>
            <div className="video-thumbnail">
                <iframe
                    width="560"
                    height="315"
                    src={`https://www.youtube.com/embed/0C7oeqORq1Y${imageSrc}`}
                    title={title}
                    frameBorder="0"
                    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                    allowFullScreen
                    className="img-fluid rounded"
                ></iframe>
                <div className="play-button">
                    <i className="fas fa-play"></i>
                </div>
            </div>
        </div>
    );
};

export default VideoCard;