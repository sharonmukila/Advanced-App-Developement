

// import './App.css'
// import { BrowserRouter,Routes,Route } from 'react-router-dom';
// import Login from './pages/Login';
// import Register from './pages/Register';



// function App() {
  

//   return (
//     <>
    
//     <BrowserRouter>
//       <Routes>
  
//         <Route path='/login' element={<Login/>} />
//         <Route path='/Register' element={<Register/>} />
//       </Routes>
//   </BrowserRouter>
 
//     </>
//   )
// }

// export default App


import React from 'react';
import Header from './Landing/Header';
import Hero from './Landing/Hero';

import About from './Landing/About';

import './App.css';
import OurServices from './Landing/OurServices';
import Footer from './Landing/Footer';
import Contact from './Landing/Contact';

const AppLan = () => {
  return (
    <div>
      <Header />
      <Hero />
      <OurServices />
      <About />
      <Contact/>
      <Footer/>
  
    </div>
  );
};

export default AppLan;
