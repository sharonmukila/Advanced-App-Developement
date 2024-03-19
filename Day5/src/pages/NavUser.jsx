import React, { useState } from 'react';
import "../css/NavUser.css";

const NavUser = () => {
  const [navLinksOpen, setNavLinksOpen] = useState(false);

  const handleHamburgerClick = () => {
    setNavLinksOpen(!navLinksOpen);
  };

  return (
    <nav>
      <div className="logo">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdZCU8V6sHJovFda94_SEhvbQ_zfdT3gpaLA&usqp=CAU" alt="Logo Image" />
      </div>
      <div className="hamburger" onClick={handleHamburgerClick}>
        <div className="line1"></div>
        <div className="line2"></div>
        <div className="line3"></div>
      </div>
      <ul className={`nav-links ${navLinksOpen ? 'open' : ''}`}>
        <li>
          <a href="#">Bookings</a>
        </li>
        <li>
          <a href="#">Themes</a>
        </li>
        <li>
          <a href="#">Photoshoot</a>
        </li>
        <li>
          <a href="#"></a>
        </li>
     
        <li>
          <button className="login-button">
            My Account
          </button>
        </li>
        <li>
          
        </li>
      </ul>
    </nav>
  );
};

export default NavUser;
