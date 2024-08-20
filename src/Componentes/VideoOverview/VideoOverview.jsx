import React from 'react';
import VideoCard from './VideoCard';
import './VideoOverview.css'

const VideoOverview = () => {
  const videos = [
    {
      title: 'Pitch 1',
      user: 'Usuário 1',
      description: 'Descrição do Pitch 1',
      

    },
    {
      title: 'Pitch 2',
      user: 'Usuário 2',
      description: 'Descrição do Pitch 2',
      
    }
  ];

  return (
        <div className="video-overview">
            <h2 className="section-title">Overview do Project</h2>
            <div className="video-grid">
                {videos.map((video, index) => (
                    <VideoCard
                    key={index}
                    title={video.title}
                    user={video.user}
                    description={video.description}
                    imageSrc={video.imageSrc}
                    />
                ))}
            </div>
        </div>
  );
};
export default VideoOverview;
