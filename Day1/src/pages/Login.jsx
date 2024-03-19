import React from 'react';
import { useNavigate } from 'react-router-dom';
import '../css/Login.css';

const Login = () => {
  const navigate = useNavigate();

  const handleLogin = () => {
   
    navigate('/navuser');
  };

  return (
    <div className='sec'>
      <div className='log'>
        <form>
          <h1>Login</h1>
          <div className="inputbox">
            <ion-icon name="mail-outline"></ion-icon>
            <input type="email" required />
            <label>Email</label>
          </div>
          <div className="inputbox">
            <ion-icon name="lock-closed-outline"></ion-icon>
            <input type="password" required />
            <label>Password</label>
          </div>
          <div className="forget">
            <label><input type="checkbox" />Remember Me</label>
            <a href="#">Forget Password</a>
          </div>
          <button onClick={handleLogin}>Log in</button>
          <div className="register">
            <p>Don't have an account? <span onClick={() => navigate('/register')}>Register</span></p>
          </div>
        </form>
      </div>
    </div>
  );
};

export default Login;
