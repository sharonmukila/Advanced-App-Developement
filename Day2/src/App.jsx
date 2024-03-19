

import './App.css'
import { BrowserRouter,Routes,Route } from 'react-router-dom';
import Login from './pages/Login';
import Register from './pages/Register';
import AppLan from './AppLan';
import NavUser from './pages/NavUser';



function App() {
  

  return (
    <>
    
    <BrowserRouter>
      <Routes>
  
        <Route path='/home' element={<AppLan/>} />
        <Route path='/login' element={<Login/>} />
        <Route path='/Register' element={<Register/>} />
        <Route path='/navuser' element={<NavUser/>}/>
        
      </Routes>
  </BrowserRouter>
 
    </>
  )
}

export default App
