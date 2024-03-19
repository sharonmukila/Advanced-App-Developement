import React from 'react';
import './Footer.css'; 
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faFacebook, faTwitter, faLinkedin, faGithub } from '@fortawesome/free-brands-svg-icons';

const FooterLeft = () => {
  return (
    <div className="footer-left">
      <h3>Party Pops<span></span></h3>
      <p className="footer-links">
        <a href="#" className="link-1">Home</a>
    
        <a href="#">About</a>
        <a href="#">Faq</a>
        <a href="#">Contact</a>
      </p>
      <p className="footer-company-name">PartyPops © 2024</p>
    </div>
  );
};


const FooterCenter = () => {
  return (
    <div className="footer-center">
      <div>
        <i className="fa fa-map-marker"></i>
        <p><span>444 S.sidco Coimbatore</span> India </p>
      </div>
      <div>
        <i className="fa fa-phone"></i>
        <p>+1.555.555.5555</p>
      </div>
      <div>
        <i className="fa fa-envelope"></i>
        <p><a href="mailto:support@company.com">PartyPops@company.com</a></p>
      </div>
    </div>
  );
};

// FooterRight component
const FooterRight = () => {
  return (
    <div className="footer-right">
      <p className="footer-company-about">
        <span>For More Reference Go Through Our  Social Links..... </span>
        Join us for our special birthday event on April 15th!
      </p>
      <div className="footer-icons">
        <a href="#"><FontAwesomeIcon icon={faFacebook} /></a>
        <a href="#"><FontAwesomeIcon icon={faTwitter} /></a>
        <a href="#"><FontAwesomeIcon icon={faLinkedin} /></a>
        <a href="#"><FontAwesomeIcon icon={faGithub} /></a>
      </div>
    </div>
  );
};


const Footer = () => {
  return (
    <footer className="footer-distributed">
      <FooterLeft />
      <FooterCenter />
      <FooterRight />
    </footer>
  );
};

export default Footer;
