
import React, { useState } from 'react';
import '../css/Register.css';
import { useNavigate } from 'react-router-dom';


const Register = () => {
  const navigatee = useNavigate();

  const handleLoginClick = () => {
    // Navigate to the login page
    navigate('/login');
  };

  const navigate = useNavigate();
  const [fullName, setFullName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [mobileNumber, setMobileNumber] = useState('');
  const [address, setAddress] = useState('');
  const [errorMessage, setErrorMessage] = useState('');

  const handleRegister = (e) => {
    e.preventDefault();

  
    if (!fullName || !email || !password || !mobileNumber || !address) {
      setErrorMessage('Please fill in all fields');
      return;
    }

    navigate('/login');
    
  };

  return (
<div className='sec'>
  
        <div className="section">
          <form onSubmit={handleRegister}>
          <div className='aaa'>

          <h1>Register</h1>
          </div>
        
      
              <div className='kk'>

             
            <div className="inputbox">
              <ion-icon name="person-outline"></ion-icon>
              <input type="text" placeholder="Full Name" required value={fullName} onChange={(e) => setFullName(e.target.value)} />
            </div>
            <div className="inputbox">
              <ion-icon name="mail-outline"></ion-icon>
              <input type="email" placeholder="Email" required value={email} onChange={(e) => setEmail(e.target.value)} />
            </div>
            <div className="inputbox">
              <ion-icon name="call-outline"></ion-icon>
              <input type="tel" placeholder="Mobile Number" required pattern="[0-9]{10}" value={mobileNumber} onChange={(e) => setMobileNumber(e.target.value)} />
            </div>
            <div className="inputbox">
              <ion-icon name="location-outline"></ion-icon>
              <input type="text" placeholder="Address" required value={address} onChange={(e) => setAddress(e.target.value)} />
            </div>
            <div className="inputbox">
              <ion-icon name="lock-closed-outline"></ion-icon>
              <input type="password" placeholder="Password" required value={password} onChange={(e) => setPassword(e.target.value)} />
            </div>
            </div>
  
            <div className="error-message">{errorMessage}</div>
  
            <div className="login">
              <p>Already Have an Account? <span onClick={() => navigate('/login')}>Login</span></p>
            </div>

            

             <button lass="regbut" onClick={handleLoginClick}>Register</button>
       
          </form>
        </div>
</div>

  );
}

export default Register;
