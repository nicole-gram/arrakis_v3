import React from "react";
import Trade from "./components/trade/Trade";
import ActiveBonds from "./pages/active_bonds";
import MyBonds from "./pages/my_bonds";
import Navbar from "./components/navbar/navbar";
import { BrowserRouter as Router, Routes, Route }
    from 'react-router-dom';


const App = () => {
  return (
    <Router>
        <Navbar />
        <Routes>
            <Route exact path='/' element={<ActiveBonds />} />
            <Route path='/active_bonds' element={<ActiveBonds />} />
            <Route path='/my_bonds' element={<MyBonds />} />
        </Routes>
    </Router>
);
};

export default App;
