import React from 'react';
import VideoCard from './VideoOverview/VideoCard';
import './';

const OverViewSection = ({ title, description}) => {
    return (
        <section style={styles.section}>
            <h2 style={styles.title}>{title}</h2>
            <p style={styles.description}>{description}</p>
        </section>
    );

};

const styles = {
    section: {
        padding: '20px',
        backgroundColor: '#f4f4f4',
        bordeRadius: '8px',
        marginBottom: '20px',
    },
    title: {
        fontSize: '24px',
        marginBottom: '10px',
    },
    description: {
        fontSize: '16px',
        color: '#555',
    },
};

export default OverViewSection