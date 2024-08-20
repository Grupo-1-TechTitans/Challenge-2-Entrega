import React from 'react';
import VideoCard from './VideoCard';
import './Overview.css';



const Overview = () => {
  return (
    <div className="overview">
      <h2><strong>Overview do Project</strong></h2>
      <div className="video-grid">
        <VideoCard className="title" title="Video Pitch 1" videoId="-R0UYHS8A_A" />
        <VideoCard className={"title"} title="Video Pitch 2" videoId="-Pkj1qIcK2Y" />{/* aqui adiciona o ID do video no yt para poder assitir na pagina */}
      </div>
    </div>
  );
};

export default Overview;
 