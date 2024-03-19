import React from 'react';



import './Contact.css';
function Contact() {
  return (
    <div className="contact-form-container">
      <div className="contact-us">
        <div className="contact-header">
          <h1>&#9135;&#9135;&#9135;&#9135;&nbsp;&nbsp;CONTACT US</h1>
        </div>
       
      <div className="header">
      If you prefer, you can also reach out to us by filling out the form below. We'll get back to you as soon as possible!
        
      </div>
      </div>
   
      
      
      <div className="contact-form">
        <form>
          <input type="text" placeholder="Name" />
          <input type="email" placeholder="Email" />
          <textarea rows="4" placeholder="Tell us about your project..."></textarea>
          <button type="button">SEND</button>
        </form>
      </div>
    </div>
  );
}

export default Contact;