import React from "react";
import ActiveBonds from "../pages/active_bonds";
import MyBonds from "../pages/my_bonds";
import Navbar from "../components/navbar/navbar";
import { BrowserRouter as Router, Routes, Route }
    from 'react-router-dom';
import SelectUser from "./select_user";


const Home = () => {
  return (
    <Router>
        <Navbar />
        <Routes>
            <Route exact path='/' element={<SelectUser />} />
            <Route path='/active_bonds' element={<ActiveBonds />} />
            <Route path='/my_bonds' element={<MyBonds />} />

        </Routes>
    </Router>
);
};

export default Home;
